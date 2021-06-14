package ex28;
/*
Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.

Challenges
Modify the program to prompt for how many numbers to add, instead of hard-coding the value. Be sure you convert the input to a number before doing the comparison.
Modify the program so that it only adds numbers and silently rejects non-numeric values. Count these invalid entries as attempts anyway. In other words, if the number of numbers to add is 5, your program should still prompt only five times.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] addNum = new int[5];
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter a number: ");
            addNum[i] = input.nextInt();
        }
        System.out.printf("The total is %d.", (numberCalculator(addNum[0], addNum[1],addNum[2], addNum[3], addNum[4])));
    }
    public static int numberCalculator(int num1, int num2, int num3, int num4, int num5)
    {
        int number = num1 + num2 + num3 + num4 + num5;
        return number;
    }
}
