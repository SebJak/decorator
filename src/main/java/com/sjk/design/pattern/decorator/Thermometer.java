package com.sjk.design.pattern.decorator;

public class Thermometer implements Sensor {

    @Override
    public String measure() {
        return "Environment temperature is 22*, ";
    }
}
