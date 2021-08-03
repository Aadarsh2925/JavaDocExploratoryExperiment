package academy.learnprogramming;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your NAME :");
        String Name=scanner.nextLine();
        System.out.println("Length of the Name is : "+Name.length());
        System.out.println("Hi "+Name);
        String lower= Name.toLowerCase();
        System.out.println("in lower "+lower);
        String upper=Name.toUpperCase();
        System.out.println("in Upper "+upper);
        System.out.println("is Name starting with letter a : "+Name.startsWith("A"));
        System.out.println(" replaced the Name : "+Name.replace(Name,"Krishna"));

        }

        }



