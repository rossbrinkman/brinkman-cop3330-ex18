package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.String;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat f = new DecimalFormat("#0.#");
        Scanner scanner = new Scanner(System.in);
        float temperature, converted;
        String input;

        System.out.println( "Press 'C' to convert from Fahrenheit to Celsius \n" +
                "or \n" +
                "Press 'F' to convert from Celsius to Fahrenheit " );
        input = scanner.nextLine();
        input = input.toUpperCase();

        while(true) {
            if (!input.equals("C") && !input.equals("F")) {
                System.out.println("Invalid Input. Try Again:");
                input = scanner.nextLine();
                input = input.toUpperCase();
            }
            else
                break;
        }

        if (input.equals("C")) {
            System.out.println( "Your Choice 'C' \n" +
                    "Please enter the temperature in Fahrenheit: " );
            temperature = scanner.nextFloat();
            converted = CelsiusConversion(temperature);
            System.out.println( "The temperature in Celsius is " + f.format(converted) + "." );
        }
        else {
            System.out.println( "Your Choice 'F' \n" +
                    "Please enter the temperature in Celsius: " );
            temperature = scanner.nextFloat();
            converted = FahrenheitConversion(temperature);
            System.out.println( "The temperature in Fahrenheit is " + f.format(converted) + "." );
        }

        scanner.close();
    }

    public static float CelsiusConversion(float temperatureInF)
    {
        return (temperatureInF - 32) * 5 / 9;
    }

    public static float FahrenheitConversion(float temperatureInC)
    {
        return (temperatureInC * 9 / 5) + 32;
    }
}
