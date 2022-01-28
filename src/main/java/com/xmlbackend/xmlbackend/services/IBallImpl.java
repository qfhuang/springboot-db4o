package com.xmlbackend.xmlbackend.services;


import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.xmlbackend.xmlbackend.connect.DataConnection;
import com.xmlbackend.xmlbackend.models.Ball;
import com.xmlbackend.xmlbackend.models.BallsArray;



import org.springframework.stereotype.Service;



@Service
public class IBallImpl implements IBall {
    private ObjectContainer db = DataConnection.getInstance();
    @Override
    public BallsArray getAll() {
        Ball balltest = new Ball(10,0,"test",0);
        System.out.println(balltest.toString());
        db.store(balltest);
       ObjectSet<Ball> balls = db.query(Ball.class);

        return ((BallsArray)balls);
    }



    @Override
    public Ball addOne(Ball ball)  {
        BallsArray balls = (BallsArray) db.query(Ball.class);

           if(!(balls.getLenght()>0)){
               ball.setId(1);
            }else{
               balls.sort();
                ball.setId((balls.getBall(((balls.getLenght())-1)).id)+1);
            }
           db.store(ball);
            return  ball;
    }

    @Override
    public int update(Ball newBall, int id) {
        BallsArray balls = (BallsArray) db.queryByExample(new Ball(id));
        if(balls.getLenght()>0){
            db.delete(balls.getBalls().get(0));
            db.store((Object) newBall);
            return 1;
        }else{
            return 0;
        }


    }

    @Override
    public int delete(int id) {
        BallsArray balls = (BallsArray) db.queryByExample(new Ball(id));
        if(balls.getLenght()>0){
            db.delete(balls.getBalls().get(0));
            return 1;
        }else{
            return 0;
        }
    }
}
