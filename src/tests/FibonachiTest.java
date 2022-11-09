package tests;

import org.junit.Test;
import org.testng.Assert;
import util.Fibonachi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FibonachiTest {

    @Test
    public void findFirstNNumbers1() {
        Fibonachi fib = new Fibonachi();
        ArrayList <Long> arr= new ArrayList<>();
        arr.add(0L);
        arr.add(1L);
        assertEquals(arr, fib.findFirstNNumbers(1));
    }

    @Test
    public void findFirstNNumbers2() {
        Fibonachi fib = new Fibonachi();
        ArrayList <Long> arr= new ArrayList<>();
        arr.add(0L);
        arr.add(1L);
        arr.add(1L);
        assertEquals(arr, fib.findFirstNNumbers(2));
    }

    @Test
    public void findFirstNNumbers3() {
        Fibonachi fib = new Fibonachi();
        ArrayList <Long> arr= new ArrayList<>();
        arr.add(0L);
        arr.add(1L);
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(5L);
        arr.add(8L);
        arr.add(13L);
        assertEquals(arr, fib.findFirstNNumbers(7));
    }

    @Test
    public void findNFib1() {
        Fibonachi fib = new Fibonachi();
        assertEquals (1, fib.findNFib(1));
    }

    @Test
    public void findNFib2() {
        Fibonachi fib = new Fibonachi();
        assertEquals (1, fib.findNFib(2));
    }

    @Test
    public void findNFib3() {
        Fibonachi fib = new Fibonachi();
        assertEquals (2, fib.findNFib(3));
    }

    @Test
    public void findNFib4() {
        Fibonachi fib = new Fibonachi();
        assertEquals (55, fib.findNFib(10));
    }
}