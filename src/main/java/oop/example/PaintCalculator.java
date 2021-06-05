/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintCalculator
{
    public static void main( String[] args) {
        System.out.print("What is the length of the ceiling in feet? ");

        Scanner input = new Scanner(System.in);
        String firstNum = input.nextLine();
        double length = Double.parseDouble(firstNum);

        System.out.print("What is the width of the ceiling in feet? ");

        String secondNum = input.nextLine();
        double width = Double.parseDouble(secondNum);

        double area = length * width;
        double convert = area/350;
        double gallons = Math.ceil(convert);
        DecimalFormat d = new DecimalFormat("#");

        System.out.println("You will need " + d.format(gallons) + " gallons of paint to cover " + area + " square feet.");
    }
}