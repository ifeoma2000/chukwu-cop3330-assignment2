package ex24;
/*
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.

Challenge
Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the First String : ");
        String s1 = input.next();
        System.out.print("Enter the second String : ");
        String s2 = input.next();
        isAnagram(s1,s2);
    }
    public static boolean isAnagram(String s1, String s2)
    {
        String  string1= s1.replaceAll("\s", "");
        String string2 = s2.replaceAll("\s", "");
        boolean decision = true;
        if(s1.length() != s2.length())
            decision = false;
        else
        {
            char[] a1 = string1.toLowerCase().toCharArray();
            char[] a2 = string2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            decision = (Arrays.equals(a1, a2));

        }

        if(decision)
        {
            System.out.println("\""+string1+"\" "+"and" + " "+ "\""+string2+"\" "+"are anagrams");
        }
        else
        {
            System.out.println("\""+string1+" and "+" "+ "\""+string2+"\""+" are not anagrams");
        }
        return decision;
    }
}
