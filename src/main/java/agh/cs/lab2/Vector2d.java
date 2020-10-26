package agh.cs.lab2;

import java.util.Objects;

import static java.lang.StrictMath.abs;

public class Vector2d {
    private int x;
    private int y;
    public Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
    public boolean precedes(Vector2d other){
        if (this.x <= other.x && this.y <= other.y) return true;
        else return false;
    }
    public boolean follows(Vector2d other){
        if (this.x >= other.x && this.y >= other.y) return true;
        else return false;
    }
    public Vector2d upperRight(Vector2d other){
        int x,y;
        if(this.x>=other.x){
            x=this.x;
        }
        else x= other.x;
        if(this.y>=other.y){
            y=this.y;
        }
        else y= other.y;
        Vector2d tmp=new Vector2d(x,y);
        return tmp;
    }
    public Vector2d lowerLeft(Vector2d other){
        int x,y;
        if(this.x<=other.x){
            x=this.x;
        }
        else x= other.x;
        if(this.y<=other.y){
            y=this.y;
        }
        else y= other.y;
        Vector2d tmp=new Vector2d(x,y);
        return tmp;
    }
    public Vector2d add(Vector2d other){
        Vector2d tmp=new Vector2d(this.x + other.x,this.y + other.y);
        return tmp;
    }
    public Vector2d subtract(Vector2d other){
        Vector2d tmp=new Vector2d(this.x - other.x,this.y - other.y);
        return tmp;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Vector2d vector2d = (Vector2d) other;
        return x == vector2d.x &&
                y == vector2d.y;
    }
    public Vector2d opposite(){
        Vector2d tmp=new Vector2d(-this.x,-this.y);
        return tmp;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
