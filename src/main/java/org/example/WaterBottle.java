package org.example;

import org.example.Item;
import org.example.entities.enums.Size;

public class WaterBottle implements Item {
    String name;
    Double weight;
    Size size;
    Double volume;

    public WaterBottle() {
    }

    public WaterBottle(String name, Double weight, Size size, Double volume) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.volume = volume;
    }

    @Override
    public void open() {
        System.out.println("The bottle was opened");
    }

    @Override
    public void close() {
        System.out.println("The bottle was closed");

    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

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
