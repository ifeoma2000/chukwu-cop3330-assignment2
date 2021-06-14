package ex31;
/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.

Challenge
Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the interface in real time as the slider moves.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("  Please input your age: ");
        String age = input.next();
        System.out.print("  Please input your heart rate: ");
        String HR = input.next();
        while(!age.matches("-?\\d+(\\.\\d+)?"))
        {
            System.out.println("Please input a valid age.");
            age = input.next();
        }
        while(!HR.matches("-?\\d+(\\.\\d+)?"))
        {
            System.out.println("Please input a valid heart rate.");
            HR = input.next();
        }
        System.out.printf("Resting Pulse: %s        Age: %s", HR, age);
        System.out.println("");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(int i= 55; i<=95; i+=5)
        {
            System.out.printf("%d%%          | %d bpm", i, (int)Math.round(calcHR(Integer.parseInt(age), Integer.parseInt(HR), i)));
            System.out.println("");
        }
    }
    public static double calcHR(int age, int HR, int intense)
    {
        double intensity = intense / 100.0;
        return (((220 - age) - HR) * intensity) + HR;
    }
}

