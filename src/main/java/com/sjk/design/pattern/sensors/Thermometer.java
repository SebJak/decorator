package com.sjk.design.pattern.sensors;

public class Thermometer implements Sensor {

    @Override
    public String measure() {
        return "Environment temperature is 22*, ";
    }
}
