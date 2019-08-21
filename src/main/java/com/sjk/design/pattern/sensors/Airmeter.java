package com.sjk.design.pattern.sensors;

public class Airmeter implements Sensor {

    private Sensor sensor;

    public Airmeter(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String measure() {
        return "Environment air's dirty is 10%, " + sensor.measure();
    }
}
