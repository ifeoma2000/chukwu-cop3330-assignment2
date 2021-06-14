package ex37;
/*
Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

Challenges
Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
public class App {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = input.nextInt();
        System.out.print("How many special characters? ");
        int special = input.nextInt();
        System.out.print("How many numbers? ");
        int num = input.nextInt();
        int chrs = length - special - num;
        if(!(chrs >=special+num))
        {
            chrs+=(int)(Math.random() * (special+num));
            chrs+=special+num;
        }
        System.out.printf("Your password is %s ",passwordGenerator(special,num,chrs));
    }
    public static String passwordGenerator(int special, int numb, int chrs)
    {
        String password = "";
       String[] a1 = {"@","?","#","$","!","%","^","&","*"};
       String[] a2 = {"1","2","3","4","5","6","7","8","9","0"};
       String[] let = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       while(special!=0 || numb!=0 || chrs!=0)
       {
           switch((int)(Math.random() * 3))
           {
               case 0:
                   if(special!=0)
                   {
                       password+=a1[(int)(Math.random() * a1.length)];
                       special--;
                   }
                   break;
               case 1:
                   if(numb!=0)
                   {
                       password+=a2[(int)(Math.random() * a2.length)];
                       numb--;
                   }
                   break;
               case 2:
                   if(chrs!=0)
                   {
                       password+=let[(int)(Math.random() * let.length)];
                       chrs--;
                   }
                   break;
           }
       }
       return password;
    }
}
