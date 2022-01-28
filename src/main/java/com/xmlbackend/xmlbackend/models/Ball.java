package com.xmlbackend.xmlbackend.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


public class Ball implements Serializable {
    public int id;
    public float size;
    public String color;
    public float weight;

    public Ball(int id, float size, String color, float weight) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.weight = weight;
    }

    public Ball() {
    }

    public Ball(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id=" + id +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
