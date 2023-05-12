package org.example;

import org.example.Item;
import org.example.entities.enums.Power;
import org.example.entities.enums.Size;

public class BluetoothHeadphone implements Item {
    String name;
    Double weight;
    Size size;
    Power power;

    public BluetoothHeadphone() {
    }

    public BluetoothHeadphone(String name, Double weight, Size size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        power = Power.OFF;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void powerOn() {
        power = Power.ON;
    }

    @Override
    public void powerOff() {
        power = Power.OFF;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }
}
