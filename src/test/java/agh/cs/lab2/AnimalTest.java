package agh.cs.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal pies =new Animal();
    @Test
    public void move() {
        Assert.assertEquals(MapDirection.NORTH ,pies.getOrientation());
        Assert.assertEquals(new Vector2d(2,2),pies.getPosition());
        MapDirection direction=MapDirection.NORTH;
        for(int i=0;i<4;i++){
            pies.move(MoveDirection.RIGHT);
            direction=direction.next();
            Assert.assertEquals(direction, pies.getOrientation());
            Assert.assertEquals(new Vector2d(2,2),pies.getPosition());
        }
        for(int i=0;i<4;i++){
            pies.move(MoveDirection.LEFT);
            direction=direction.previous();
            Assert.assertEquals(direction, pies.getOrientation());
            Assert.assertEquals(new Vector2d(2,2),pies.getPosition());
        }
        for(int i=3;i<8;i++){
            pies.move(MoveDirection.FORWARD);
            Assert.assertEquals(MapDirection.NORTH, pies.getOrientation());
            if(i<5){
                Assert.assertEquals(new Vector2d(2,i),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(2,i-5),pies.getPosition());
            }
        }
        for(int i=1;i>-4;i--){
            pies.move(MoveDirection.BACKWARD);
            Assert.assertEquals(MapDirection.NORTH, pies.getOrientation());
            if(i>-1){
                Assert.assertEquals(new Vector2d(2,i),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(2,i+5),pies.getPosition());
            }
        }
        pies.move(MoveDirection.RIGHT);
        for(int i=3;i<8;i++){
            pies.move(MoveDirection.FORWARD);
            Assert.assertEquals(MapDirection.EAST, pies.getOrientation());
            if(i<5){
                Assert.assertEquals(new Vector2d(i,2),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(i-5,2),pies.getPosition());
            }
        }
        for(int i=1;i>-4;i--){
            pies.move(MoveDirection.BACKWARD);
            Assert.assertEquals(MapDirection.EAST, pies.getOrientation());
            if(i>-1){
                Assert.assertEquals(new Vector2d(i,2),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(i+5,2),pies.getPosition());
            }
        }
        pies.move(MoveDirection.RIGHT);
        for(int i=3;i<8;i++){
            pies.move(MoveDirection.BACKWARD);
            Assert.assertEquals(MapDirection.SOUTH, pies.getOrientation());
            if(i<5){
                Assert.assertEquals(new Vector2d(2,i),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(2,i-5),pies.getPosition());
            }
        }
        for(int i=1;i>-4;i--){
            pies.move(MoveDirection.FORWARD);
            Assert.assertEquals(MapDirection.SOUTH, pies.getOrientation());
            if(i>-1){
                Assert.assertEquals(new Vector2d(2,i),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(2,i+5),pies.getPosition());
            }
        }
        pies.move(MoveDirection.RIGHT);
        for(int i=3;i<8;i++){
            pies.move(MoveDirection.BACKWARD);
            Assert.assertEquals(MapDirection.WEST, pies.getOrientation());
            if(i<5){
                Assert.assertEquals(new Vector2d(i,2),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(i-5,2),pies.getPosition());
            }
        }
        for(int i=1;i>-4;i--){
            pies.move(MoveDirection.FORWARD);
            Assert.assertEquals(MapDirection.WEST, pies.getOrientation());
            if(i>-1){
                Assert.assertEquals(new Vector2d(i,2),pies.getPosition());
            }
            else {
                Assert.assertEquals(new Vector2d(i+5,2),pies.getPosition());
            }
        }
    }
}