package coreapi;

import java.time.*;
import java.util.Arrays;

public class ExerciceCoreAPI {

    // Exercise 1: Basic StringBuilder Operations

// TODO: Create a method that:

    public static String helloWorld(String text) {
        // - Takes a String input "Hello World"
        // - Use StringBuilder to:

        StringBuilder stringBuilder = new StringBuilder(text);
        // a) Reverse the string
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println("Capacity: " + stringBuilder.capacity() + ", Length: " + stringBuilder.length());

        //b) Insert "Beautiful " at index 6
        stringBuilder.reverse();
        stringBuilder.insert(6, "Beautiful");
        System.out.println(stringBuilder);

        //c) Delete "World"
        int index = stringBuilder.indexOf("World");
        if (index != -1) {
            stringBuilder.delete(index, index + "World".length());
        }
        System.out.println(stringBuilder);


        //d) Append " Java Programming"
        stringBuilder.append("Java Programming");
        System.out.println("Ajout de Java Programming : " + stringBuilder);


        //e) Replace "Beautiful" with "Amazing"
        int index2 = stringBuilder.indexOf("Beautiful");
        if (index2 != -1) {
            stringBuilder.replace(index2, index2 + "Beautiful".length(), "Amazing");
        }
        System.out.println(stringBuilder);

        // - Print StringBuilder capacity and length at each step
        System.out.println("capacity : " + stringBuilder.capacity() + " lenth : "+  stringBuilder.length());

        //Return the final string
        return stringBuilder.toString();

    };


    public static void main(String[] args) {
        //helloWorld("Hello World");

        // Exercise 2: StringBuilder Performance Test

        // TODO: Compare performance:
        // 1. Concatenate numbers 1-10000 using String (+)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i <= 10000; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time : " + totalTime + " ms");


        // 2. Concatenate numbers 1-10000 using StringBuilder
        // - Measure time for both approaches using System.currentTimeMillis()
        // - Print the time difference
        // - Explain why there's a difference
    }
}
