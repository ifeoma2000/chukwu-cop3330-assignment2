package ex38;
/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.

Challenge
Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String[] numb = input.nextLine().split(" ");

        System.out.printf("The even numbers are %s", displayArray(filterEvenNumbers(numb)));
    }
    public static String [] filterEvenNumbers(String [] input)
    {
        String [] arr = new String[input.length];
        for(int i=0; i< input.length;i++ )
        {
            if(Integer.parseInt(input[i]) %2 != 1)
            {
                arr[i] = input[i];
            }
        }
        return arr;
    }
    public static String displayArray(String[] arr)
    {
        String a = "";
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] != null)
                    a+=arr[i] + " ";
        }
        return a;
    }
}
