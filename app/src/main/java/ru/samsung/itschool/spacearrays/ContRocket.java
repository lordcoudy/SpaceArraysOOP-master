package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;

/**
 * Created by lordcoudy on 11/10/17.
 */

public class ContRocket extends Rocket {
    private float toX, toY;
    void setTarget(float toX, float toY) {
        this.toX = toX;
        this.toY = toY;
        this.vx = toX - x;
        this.vy = toY - y;
        float d = (float) Math.sqrt(vx * vx + vy * vy);
        //d /= 5;
        //vx /= d;
        //vy /= d;
        vx *= 5 / d;
        vy *= 5 / d;
    }


    ContRocket(Bitmap pic) {
        super(pic);
        toX = x;
        toY = y;
    }
    void move(){

        if ((toX-x)*(toX-x) + (toY-y)*(toY-y) < 1){
           return;

        }
        super.move();
    }

}
