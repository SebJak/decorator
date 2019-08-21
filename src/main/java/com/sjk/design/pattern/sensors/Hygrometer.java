package com.sjk.design.pattern.sensors;

public class Hygrometer implements Sensor {

    private Sensor sensor;

    public Hygrometer(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String measure() {
        return "Environment humidity is 45%, " + sensor.measure();
    }
}
