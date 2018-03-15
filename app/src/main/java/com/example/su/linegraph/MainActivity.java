package com.example.su.linegraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {


     public LineChart chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chart=(LineChart)findViewById(R.id.chart);
        chart.setDragEnabled(true);
        chart.setScaleEnabled(false);
        ArrayList<Entry> yval= new ArrayList<>();

        yval.add(new Entry(0,60f));
        yval.add(new Entry(1,40f));
        yval.add(new Entry(2,30f));
        yval.add(new Entry(3,20f));
        yval.add(new Entry(4,60f));
        yval.add(new Entry(5,20.50f));
        yval.add(new Entry(6,10f));
        yval.add(new Entry(7,50.50f));
        yval.add(new Entry(9,75.50f));
        yval.add(new Entry(10,35.50f));
        yval.add(new Entry(11,45.50f));
        yval.add(new Entry(12,15.50f));
        yval.add(new Entry(13,25.50f));
        yval.add(new Entry(14,55.50f));
        yval.add(new Entry(15,45.50f));
        yval.add(new Entry(16,75.50f));
        yval.add(new Entry(17,95.50f));
        yval.add(new Entry(18,05.50f));
        yval.add(new Entry(19,95.50f));
        yval.add(new Entry(20,55.50f));
        yval.add(new Entry(21,45.50f));
        yval.add(new Entry(22,75.50f));
        yval.add(new Entry(23,95.50f));
        yval.add(new Entry(24,05.50f));
        yval.add(new Entry(25,95.50f));





        LineDataSet set1= new LineDataSet(yval,"Data set1");
          set1.setFillAlpha(340);
          set1.setColor(Color.RED);
        set1.setHighLightColor(Color.GREEN);
        set1.setCircleRadius(3);
          set1.setLineWidth(3f);
          set1.setDrawFilled(true);
          set1.setValueTextSize(13f);
          set1.disableDashedLine();
        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10f);
        xAxis.setTextColor(Color.RED);
        xAxis.setDrawAxisLine(true);

        xAxis.setDrawGridLines(false);
        YAxis left = chart.getAxisLeft();
//        left.setDrawLabels(false); // no axis labels
         left.setDrawAxisLine(true); // no axis line
//        left.setDrawGridLines(false); // no grid lines
        left.setDrawZeroLine(true); // draw a zero line
        chart.getAxisRight().setEnabled(false);
          ArrayList<ILineDataSet>dataSets= new ArrayList<>();
          dataSets.add(set1);
        LineData data= new LineData(dataSets);
        chart.setData(data);
        chart.animateXY(3000, 3000);
        chart.setScaleXEnabled(true);
        chart.setScaleYEnabled(true);
        chart.setDragEnabled(true);
        chart.setTouchEnabled(true);
        chart.setDoubleTapToZoomEnabled(true);
        chart.setVisibleXRangeMaximum(10); // allow 20 values to be displayed at once on the x-axis, not more
        //chart.moveViewToX(10);
        chart.getDescription().setEnabled(false);
        chart.getLegend().setEnabled(false);



    }
}
