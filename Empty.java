package com.example.ioana.tictactoeapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/**
 * Created by ioana on 3/28/2017.
 */

public class Empty extends Cell {
    public Empty(int x, int y){
        super(x,y);
    }
    public void draw(Canvas g, Resources res, int x, int y, int w, int h){
        Bitmap im =BitmapFactory.decodeResource(res, R.drawable.blank);
        g.drawBitmap(im, null, new Rect(x*w, y*h, (x*w)+w, (y*h)+h), new Paint());
    }
    @Override

    public  boolean equals(Object obj){
        if (obj instanceof Empty){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return " ";
    }
}
