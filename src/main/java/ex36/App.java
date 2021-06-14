package ex36;
/*
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times, it’s helpful to collect data so you can easily spot abnormalities. For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.

Challenges
Have the program read in numbers from an external file instead of prompting for the values.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String user = input.nextLine();
        arr.add(user);
        while (!user.equals("done")){
            System.out.print("Enter a number: ");
            user = input.nextLine();
            while (!user.matches("-?\\d+(\\.\\d+)?") && !user.equals("done")){
                System.out.println("Please input a valid integer");
                System.out.print("Enter a number: ");
                user = input.nextLine();
            }
            arr.add(user);
        }
        arr.remove(arr.size() - 1);
        String toString = "";
        for (String str : arr){
            toString += " " + str + ",";
        }
        System.out.println("Numbers:" + toString.substring(0, toString.length() - 1));

        System.out.printf("The average is %.2f", average(arr));
        System.out.println();
        System.out.printf("The min is %d", min(arr));
        System.out.println();
        System.out.printf("The max is %d", max(arr));
        System.out.println();
        System.out.printf("The standard deviation is %.2f", std(arr));

    }
    public static double average(ArrayList<String> input){
        double sum = 0;
        for (String str : input){
            sum += Integer.parseInt(str);
        }
        return sum/input.size();
    }
    public static int min(ArrayList<String> input){
        int min = Integer.parseInt(input.get(0));
        for (String str : input){
            if (Integer.parseInt(str) < min)
                min = Integer.parseInt(str);
        }
        return min;
    }
    public static int max(ArrayList<String> input){
        int max = Integer.parseInt(input.get(0));
        for (String str : input){
            if (Integer.parseInt(str) > max)
                max = Integer.parseInt(str);
        }
        return max;
    }
    public static double std(ArrayList<String> input){
        int sum = 0;
        double average = average(input);
        for (String str : input){
            sum += Math.pow(Integer.parseInt(str) - average, 2);
        }
        return Math.pow(sum/input.size(), .5);
    }


}

