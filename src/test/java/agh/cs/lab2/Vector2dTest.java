package agh.cs.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vector2dTest {
    Vector2d position1 = new Vector2d(1,2);
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    @Test
    public void equalsTest(){
        Assert.assertTrue(position1.equals(position1));
        Assert.assertTrue(position1.equals(new Vector2d(1,2)));
        Assert.assertFalse(position1.equals(new Vector2d(2,1)));
    }
    @Test
    public void toStringTest(){
        Assert.assertEquals("(1,2)",position1.toString());
        Assert.assertNotEquals("(1,1)",position1.toString());
    }
    @Test
    public void precedesTest(){
        Assert.assertTrue(position1.precedes(new Vector2d(2,2)));
        Assert.assertFalse(position1.precedes(new Vector2d(0,0)));
        Assert.assertTrue(position1.precedes(new Vector2d(1,2)));
    }
    @Test
    public void followsTest(){
        Assert.assertTrue(position1.follows(new Vector2d(0,0)));
        Assert.assertFalse(position1.follows(new Vector2d(2,2)));
        Assert.assertTrue(position1.follows(new Vector2d(1,2)));
    }
    @Test
    public void upperRightTest(){
        Assert.assertEquals(new Vector2d(max,max),position1.upperRight(new Vector2d(max,max)));
        Assert.assertEquals(position1,position1.upperRight(new Vector2d(min,min)));
        Assert.assertEquals(new Vector2d(1,max),position1.upperRight(new Vector2d(min,max)));
        Assert.assertEquals(new Vector2d(max,2),position1.upperRight(new Vector2d(max,min)));
    }
    @Test
    public void lowerLeftTest(){
        Assert.assertEquals(new Vector2d(min,min),position1.lowerLeft(new Vector2d(min,min)));
        Assert.assertEquals(position1,position1.lowerLeft(new Vector2d(max,max)));
        Assert.assertEquals(new Vector2d(1,min),position1.lowerLeft(new Vector2d(max,min)));
        Assert.assertEquals(new Vector2d(min,2),position1.lowerLeft(new Vector2d(min,max)));
    }
    @Test
    public void addTest(){
        Assert.assertEquals(new Vector2d(3,3),position1.add(new Vector2d(2,1)));
        Assert.assertEquals(position1,position1.add(new Vector2d(0,0)));
        Assert.assertNotEquals(new Vector2d(0,0),position1.add(new Vector2d(2,1)));
    }
    @Test
    public void subtractTest(){
        Assert.assertEquals(new Vector2d(-1,1),position1.subtract(new Vector2d(2,1)));
        Assert.assertEquals(position1,position1.subtract(new Vector2d(0,0)));
        Assert.assertNotEquals(new Vector2d(0,0),position1.subtract(new Vector2d(2,1)));
    }
    @Test
    public void oppositeTest(){
        Assert.assertEquals(new Vector2d(-1,-2),position1.opposite());
        Assert.assertNotEquals(position1,position1.opposite());
    }
}