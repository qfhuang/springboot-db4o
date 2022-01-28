package com.xmlbackend.xmlbackend.services;

import com.db4o.ObjectSet;
import com.xmlbackend.xmlbackend.models.Ball;
import com.xmlbackend.xmlbackend.models.BallsArray;


public interface IBall {
    BallsArray getAll() ;
    Ball addOne(Ball ball) ;
    int update(Ball ball, int id);
    int delete(int id);
}
