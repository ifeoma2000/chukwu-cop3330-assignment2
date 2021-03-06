package ex30;
/*
Exercise 30 - Multiplication Table
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).

Example Output

    1    2    3    4    5    6    7    8    9   10   11   12
    2    4    6    8   10   12   14   16   18   20   22   24
    3    6    9   12   15   18   21   24   27   30   33   36
    4    8   12   16   20   24   28   32   36   40   44   48
    5   10   15   20   25   30   35   40   45   50   55   60
    6   12   18   24   30   36   42   48   54   60   66   72
    7   14   21   28   35   42   49   56   63   70   77   84
    8   16   24   32   40   48   56   64   72   80   88   96
    9   18   27   36   45   54   63   72   81   90   99  108
   10   20   30   40   50   60   70   80   90  100  110  120
   11   22   33   44   55   66   77   88   99  110  121  132
   12   24   36   48   60   72   84   96  108  120  132  144

Constraint
Use a nested loop to complete this program.
Align each column within the table without using the tab character.

Challenges
Create a graphical program. Use a drop-down list to change the base number. Generate or update the table when the number is selected.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
public class App {
    public static void main(String[] args)
    {
        System.out.println(multiTable());
    }

    public static String multiTable()
    {
    String returnString = "";
    for(int i=1; i<13; i++)
    {
        for(int k=1; k<13; k++)
        {
            if(i * k <10 && k==1)
            {
                returnString += " ";
            }
            if(i * (k+1)>9 && i * (k+1)<=99)
            {
                returnString += i * k+ "    ";
            }
            else if(i * k>9 && i * k<=99 && i * (k+1)>99)
            {
                returnString += i * k+ "   ";
            }
            else if(i * k>99)
            {
                returnString += i * k+ "   ";
            }
            else
            {
                returnString += i * k+ "     ";
            }

        }
        returnString += "\n";
    }
    return returnString;
    }

}
