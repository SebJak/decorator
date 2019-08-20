package com.sjk.design.pattern.decorator;

public class Home {

    public static void main(String[] args) {

        Sensor tools = new Thermometer();
        tools = new Hygrometer(tools);
        tools = new Airmeter(tools);

        System.out.println(tools.measure());
    }
}
