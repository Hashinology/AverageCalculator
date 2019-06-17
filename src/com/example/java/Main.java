package com.example.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// make average from user input list

        ArrayList<Double> number = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to calculate average");

        String[] token = in.nextLine().split("\\s");

        for (int i = 0; i < token.length; i++) {
            number.add(Double.parseDouble(token[i]));
            if (number.size() == 0) {
                System.out.println("No Average");
            } else {
                double total = 0;
                for (double element :
                        number) {


                    total = total + element;
                }
                double average = total / number.size();
                System.out.println("the average is: " + average);
            }
        }
    }
}
