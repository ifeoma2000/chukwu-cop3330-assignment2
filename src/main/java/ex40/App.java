package ex40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
/*
Exercise 40 - Filtering Records
Sorting records is helpful, but sometimes you need to filter down the results to find or display only what you’re looking for.

Given the following data set create a program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


Example Output
Enter a search string: Jac

Results:

Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |

Constraint
Implement the data using an array of maps or an associative array.

Challenges
Make the search case insensitive.
Add the option to search by position.
Add the option to find all employees where their separation date is six months ago or more.
Read in the data from a file.
 */
//UCF COP3330 Summer 2021 Assignment 2 Solution Copyright 2021 Ifeoma Chukwu
public class App {
    static ArrayList<Map<String, String[]>> list = new ArrayList<>();//JUnit check here
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = input.nextLine();
        put("Jacquelyn Jackson", new String[] {"DBA", ""});
        put("Tou Xiong", new String[] {"Software Engineer", "2016-10-05"});
        put("Jake Jacobson", new String[] {"Programmer", ""});
        put("John Johnson", new String[] {"Manager", "2016-12-31"});
        put("Michaela Michaelson", new String[] {"District Manager", "2015-12-19"});
        put("Sally Weber", new String[] {"Web Developer", "2015-12-18"});
        put("Mark Al", new String[] {"Web Developer", "2015-12-18"});
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (Map<String, String[]> map: list){
            for (Map.Entry<String, String[]> ent : map.entrySet()){
                String nspaces = "";
                String jspaces = "";
                for (int i = 0; i < 20 - ent.getKey().length(); i++)
                    nspaces += " ";
                for (int i = 0; i < 19 - ent.getValue()[0].length(); i++)
                    jspaces += " ";
                if(ent.getKey().contains(search))
                System.out.println(ent.getKey() + nspaces + "|" + ent.getValue()[0] + jspaces + "|" + ent.getValue()[1]);
            }
        }

    }
    public static void put(String name, String[] data) {


        TreeMap<String, String[]> addMap = new TreeMap<>();
        addMap.put(name, data);
        list.add(addMap);


        ArrayList<Map<String, String[]>> maps = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            maps.add(list.get(i));
        }

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < maps.size(); i++){
            for (Map.Entry<String, String[]> ent : maps.get(i).entrySet())
                names.add(ent.getKey());
        }


        ArrayList<String> newNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String[] tempA = names.get(i).split(" ");
            newNames.add(tempA[1] + " " + tempA[0]);
        }

        Collections.sort(newNames);

        ArrayList<String> sortedNames = new ArrayList<>();
        for (int i = 0; i < newNames.size(); i++) {
            String[] tempA = newNames.get(i).split(" ");
            sortedNames.add(tempA[1] + " " + tempA[0]);
        }

        ArrayList<Map<String, String[]>> finalSortedMapList = new ArrayList<>();

        for (int i = 0; i < sortedNames.size(); i++){
            TreeMap<String, String[]> tempMap = new TreeMap<>();
            String tempName = sortedNames.get(i);
            String[] tempVal = findMapValue(tempName);
            tempMap.put(tempName, tempVal);
            finalSortedMapList.add(tempMap);
        }

        list = finalSortedMapList;


    }

    public static String[] findMapValue(String name){
        for (int i = 0; i < list.size(); i++){
            for (Map.Entry<String, String[]> ent : list.get(i).entrySet())
                if (ent.getKey().equals(name))
                    return ent.getValue();
        }
        return new String[]{"Value not found"};
    }
}
