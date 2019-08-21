package com.sjk.design.pattern.sensors;

public class Home {

    public static void main(String[] args) {

        Sensor tools = new Hygrometer(new Airmeter(new Thermometer()));
        System.out.println(tools.measure());
    }
}
