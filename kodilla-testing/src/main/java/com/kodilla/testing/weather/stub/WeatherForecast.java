package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateMeanTemperatures() {
        Map<String, Double> resultMean = new HashMap<>();
        double meanValue = 0;
        for (Map.Entry<String, Double> meanEntry : temperatures.getTemperatures().entrySet()) {
            meanValue += meanEntry.getValue();
            resultMean.put(meanEntry.getKey(), meanEntry.getValue());
        }
        double mean = meanValue / resultMean.size();
        return mean;
    }
    public double calculateMedianTemperature(){
        List<Double> tempList = new LinkedList<>();
        for (Map.Entry<String, Double> medianEntry : temperatures.getTemperatures().entrySet()) {
            double tempNumSort = medianEntry.getValue();
            tempList.add(tempNumSort);
        }
                Collections.sort(tempList);
                int medianAR = (tempList.size()) / 2;
                double median = tempList.get(medianAR);
        return median;
    }
}