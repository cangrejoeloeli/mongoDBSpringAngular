package com.db.msApp.services.charts;

import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class LineChartRanges {

    /**
     * Crea el data set para crear el grafico
     */
    private XYDataset createRangesDataset() {

        TimeSeries rangoX = new TimeSeries("Rango X");
        TimeSeries rangoY = new TimeSeries("Rango Y");

        rangoX.add(new Day(1, 1, 2023), 50);
        rangoX.add(new Day(2, 1, 2023), 70);
        rangoX.add(new Day(3, 1, 2023), 60);

        rangoY.add(new Day(1, 1, 2023), 80);
        rangoY.add(new Day(2, 1, 2023), 90);
        rangoY.add(new Day(3, 1, 2023), 85);

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(rangoX);
        dataset.addSeries(rangoY);

        return dataset;
    }
}
