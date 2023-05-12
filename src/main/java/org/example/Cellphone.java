package org.example;

import org.example.Item;
import org.example.entities.enums.Power;
import org.example.entities.enums.Size;

public class Cellphone implements Item {

    String brand;
    String name;
    double weight;
    Size size;
    Power power;

    public Cellphone() {
    }

    public Cellphone(String brand, String name, double weight, Size size) {
        this.brand = brand;
        this.name = name;
        this.weight = weight;
        this.size = size;
        power = Power.OFF;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void powerOn() {
        System.out.println("The phone was powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("The phone was powered off");

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
