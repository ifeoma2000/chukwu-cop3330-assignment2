package ex27;
/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter an employee ID: A12-1234
"J" is not a valid first name. It is too short.
The last name must be filled in.
The ZIP code must be numeric.
A12-1234 is not a valid ID.
Or

Enter the first name: Jimmy
Enter the last name: James
Enter the ZIP code: 55555
Enter an employee ID: TK-421
There were no errors found.

Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.

Challenges
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.ArrayList;
public class App {
    static ArrayList<String> errorMessages = new ArrayList<>();
    public static void main(String[] args)
    {
        validateInput("J"," ", " A12-1234"," ABCDE");
    }
    public static int validateInput(String firstName, String lastName, String employeeID, String zipCode)
    {
        validateFirstName(firstName);
        validateLastName(lastName);
        validateEmployeeID(employeeID);
        validateZipCode(zipCode);
        for (String errorMessage : errorMessages) {
            System.out.println(errorMessage);
        }
        if(errorMessages.size() == 0)
        {
            System.out.println("There are no errors found.");
            return 0;
        }
        return 1;
    }
    public static void validateFirstName(String name)
    {
        if(name.length() < 2)
        {
            errorMessages.add(name + " is not a valid first name. It is too short");
        }
    }
    public static void validateLastName(String name)
    {
        if(name.length() < 2)
        {
            errorMessages.add(name + " is not a valid last name. It is too short");
        }
    }
    public static void validateZipCode(String code)
    {
        for(int i = 0; i<code.length(); i++)
        {
            char c = code.charAt(i);
            if(!Character.isDigit(c))
            {
                errorMessages.add("The zipcode is not numeric.");
                break;
            }
        }
    }
    public static void validateEmployeeID(String userID)
    {
        if (userID.length() < 7)
        {
            errorMessages.add(userID+ " is not a valid ID");
            return;
        }
        for(int i = 0; i<userID.length(); i++)
        {
            char c = userID.charAt(i);
            if(i<=1)
            {
                if(!Character.isLetter(c))
                {
                    errorMessages.add(userID+ " is not a valid ID");
                    break;
                }
            }
            else if(i==2)
            {
                if(c != '-')
                {
                    errorMessages.add(userID+ " is not a valid ID");
                    break;
                }
            }
            else if(i<=6)
            {
                if(!Character.isDigit(c))
                {
                    errorMessages.add(userID+ " is not a valid ID");
                    break;
                }
            }
        }
    }
}
