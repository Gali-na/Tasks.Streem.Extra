package org.example;

import java.util.Random;

public class СreaterArray {
    public static int [] creat () {
        int [] myArray = new int[100];
        Random rand = new Random();
        for (int i=0; i< 100; i++) {
            myArray [i]=rand.nextInt(15);
        }
        return myArray;
    }
}
