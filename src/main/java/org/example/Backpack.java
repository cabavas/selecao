package org.example;

import org.example.entities.enums.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backpack {
    double backpackWeight = 200;
    List<Object> objects = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void addItem(Notebook object) {
        String name;
        Size size;
        String brand;
        double weight;

        brand = "Asus";
        weight = 850;
        name = "Notebook";
        size = Size.GRANDE;
        if (backpackWeight + weight > 3000) {
            System.out.println("Object too heavy for the backpack");
        } else {
            backpackWeight += weight;
            objects.add(new Notebook(name, brand, weight, size));
        }
    }

    public void addItem(Cellphone object) {
        String name;
        Size size;
        String brand;
        double weight;

        brand = "Samsung A03";
        weight = 350;
        name = "Cellphone";
        size = Size.PEQUENO;
        if (backpackWeight + weight > 3000) {
            System.out.println("Object too heavy for the backpack");
        } else {
            backpackWeight += weight;
            objects.add(new Notebook(brand, name, weight, size));
        }
    }

    public void addItem(WaterBottle object) {
        String name;
        Size size;
        double weight;
        double volume;

        name = "Water bottle";
        weight = 200;
        size = Size.MEDIO;
        volume = 450;

        if (backpackWeight + weight > 3000) {
            System.out.println("Object too heavy for the backpack");
        } else {
            backpackWeight += weight;
            objects.add(new WaterBottle(name, weight, size, volume));
        }
    }

    public void addItem(BluetoothHeadphone object) {
        String name;
        double weight;
        Size size;

        name = "Bluetooth Headphone";
        weight = 180;
        size = Size.MEDIO;

        if (backpackWeight + weight > 3000) {
            System.out.println("Object too heavy for the backpack");
        } else {
            backpackWeight += weight;
            objects.add(new BluetoothHeadphone(name, weight, size));
        }
    }


}