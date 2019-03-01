package com.example.flooring;

import java.io.Serializable;

public class Flooring implements Serializable {

    int width;
    int length;
    double area;

    public Flooring(){
        this.width = 0;
        this.length = 0;
        this.area = calculateArea();
    }

    public Flooring(int width, int length){
        this.width = width;
        this.length = length;
        this.area = calculateArea();
    }

    public double calculateArea(){
        return this.width * this.length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public String toString(){
        return "Width is " + getWidth() + " and length is " +
                getLength() + " and flooring needed is " +
                calculateArea();
    }
}
