package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest{
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println("result: " + out);
    }
    @Test
    public void when04to20then4() {
        int expected = 4;
        Point a = new Point(0, 4);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.5);
        System.out.println("result: " + out);
    }

    @Test
    public void when00to27then7() {
        int expected = 7;
        Point a = new Point(0, 0);
        Point b = new Point(2, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.5);
        System.out.println("result: " + out);
    }
    @Test
    public void when000to271then7() {
        int expected = 7;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 7, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.5);
        System.out.println("result: " + out);
    }
    @Test
    public void when126to554then7() {
        int expected = 5;
        Point a = new Point(1, 2, 6);
        Point b = new Point(5, 5, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.5);
        System.out.println("result: " + out);
    }

}