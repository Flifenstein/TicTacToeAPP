package com.example.ioana.tictactoeapp;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
/**
 * Created by ioana on 3/28/2017.
 */

public abstract class Cell extends  Point{

    public Cell(int x, int y){
        super(x,y);
    }
    abstract  public  void  draw(Canvas g, Resources res, int x, int y, int w, int h);
}
