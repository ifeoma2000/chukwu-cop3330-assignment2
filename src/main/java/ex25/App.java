package ex25;
/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.

Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
public class App {
    public static void main(String[] args) {
        App app = new App();
        String a = "12345";
        String b = "abcdef";
        String c = "abc123xyz";
        String d = "1337h@xor!";

        app.passwordValidator(a);
        app.passwordValidator(b);
        app.passwordValidator(c);
        app.passwordValidator(d);
    }
        public int passwordValidator(String password) {
            int strength = 0;
            if (password.length() < 8)
            {
                for (int i = 0; i < password.length(); i++)
                {
                    if (Character.isDigit(password.charAt(i)))
                    {
                        strength = 0;
                    }
                    else
                    {
                        break;
                    }
                }

                for (int i = 0; i < password.length(); i++)
                {
                    if (Character.isAlphabetic(password.charAt(i)))
                    {
                        strength = 1;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else
            {
                for (int i = 0; i < password.length(); i++)
                {
                    if (Character.isLetterOrDigit(password.charAt(i)))
                    {
                        strength = 2;
                        break;
                    }
                }

                for (int i = 0; i<password.length(); i++)
                {
                    if ( ((password.charAt(i) >= 33) && (password.charAt(i) <= 47) || (password.charAt(i) >= 58) && (password.charAt(i) <= 64)))
                    {
                        strength = 3;
                        break;
                    }
                }

            }

            switch (strength) {
                case 0:
                    System.out.printf("The password %s is a very weak password.", password);
                    break;
                case 1:
                    System.out.printf("The password %s is a weak password.", password);
                    break;
                case 2:
                    System.out.printf("The password %s is a strong password.", password);
                    break;
                case 3:
                    System.out.printf("The password %s is a very strong password.", password);
                    break;
                default:
                    break;
            }
            return strength;
        }

    }


