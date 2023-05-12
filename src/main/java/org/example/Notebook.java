package org.example;

import org.example.Item;
import org.example.entities.enums.Power;
import org.example.entities.enums.Size;

public class Notebook implements Item {
    String name;
    String brand;
    double weight;
    Size size;

    Power power;

    public Notebook() {
    }

    public Notebook(String name, String brand, double weight, Size size) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.size = size;
        power = Power.OFF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("The notebook was opened");

    }

    @Override
    public void close() {
        System.out.println("The notebook was closed");

    }

    @Override
    public void powerOn() {
        System.out.println("The notebook was powered on");

    }

    @Override
    public void powerOff() {
        System.out.println("The notebook was powered off");

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
