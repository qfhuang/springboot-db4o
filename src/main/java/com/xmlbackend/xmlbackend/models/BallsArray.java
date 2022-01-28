package com.xmlbackend.xmlbackend.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class BallsArray {
    List<Ball> balls = new ArrayList<>();

    public BallsArray() {
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
    }
    public int getLenght() {
        return this.balls.size();
    }




    public void sort() {
        Collections.sort(balls, new Sortbyroll());
    }


    public Ball getBall(int i) {
        return balls.get(i);
    }
    public void unshift() {
        balls.remove(0);
    }
}
class Sortbyroll implements Comparator<Ball>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Ball a, Ball b)
    {
        return a.id - b.id;
    }
}
