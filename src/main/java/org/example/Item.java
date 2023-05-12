package org.example;

import org.example.entities.enums.Size;

import java.util.Optional;

public interface Item {

    public void open();
    public void close();
    public void powerOn();
    public void powerOff();
    public double getWeight();
    public Size getSize();
    public String getName();

}
