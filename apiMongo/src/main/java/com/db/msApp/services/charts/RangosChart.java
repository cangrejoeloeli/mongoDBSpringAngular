package com.db.msApp.services.charts;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class RangosChart {

    public JFreeChart createRangosChart() {

        XYDataset dataset = createRangesDataset();

        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Rangos", "Fecha", "Valores", dataset,
                true, true, false);

        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        // Customize the renderer for line colors
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.BLUE);
        plot.setRenderer(renderer);
        //
        // Customize the date axis
        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new SimpleDateFormat("EEEE, MMMM dd, yyyy"));

        return chart;
    }

    /**
     * Crea el data set para crear el grafico
     */
    private XYDataset createRangesDataset() {

        TimeSeries rangoX = new TimeSeries("Rango X");
        TimeSeries rangoY = new TimeSeries("Rango Y");

        Calendar calendar = new GregorianCalendar(2024, Calendar.JANUARY, 1);
        Date startDate = calendar.getTime();
        calendar = new GregorianCalendar(2024, Calendar.JANUARY, 31);
        Date endDate = calendar.getTime();

        for (int i = 0; i < 100; i++) {
            Date randomDate = RandomDateTimeGenerator.getRandomDate(startDate, endDate);
            rangoX.add(new Minute(randomDate), RandomDateTimeGenerator.RANDOM.nextDouble() * 100);
            randomDate = RandomDateTimeGenerator.getRandomDate(startDate, endDate);
            rangoY.add(new Minute(randomDate), RandomDateTimeGenerator.RANDOM.nextDouble() * 100);
            System.out.println(randomDate);
        }

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(rangoX);
        dataset.addSeries(rangoY);

        return dataset;
    }

}
