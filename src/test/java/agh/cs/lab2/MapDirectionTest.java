package agh.cs.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapDirectionTest {
    @Test
    public void NextTest(){
        Assert.assertEquals(MapDirection.EAST, MapDirection.NORTH.next());
        Assert.assertEquals(MapDirection.SOUTH, MapDirection.EAST.next());
        Assert.assertEquals(MapDirection.WEST, MapDirection.SOUTH.next());
        Assert.assertEquals(MapDirection.NORTH, MapDirection.WEST.next());
    }
    @Test
    public void PreviousTest(){
        Assert.assertEquals(MapDirection.WEST, MapDirection.NORTH.previous());
        Assert.assertEquals(MapDirection.NORTH, MapDirection.EAST.previous());
        Assert.assertEquals(MapDirection.EAST, MapDirection.SOUTH.previous());
        Assert.assertEquals(MapDirection.SOUTH, MapDirection.WEST.previous());
    }

}