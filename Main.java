package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Would you like to use the [I]mperial or [M]etric System?");
        Scanner scan = new Scanner(System.in);
        String User_Answer = scan.nextLine().toUpperCase();

        switch(User_Answer){
            case "I":
               System.out.println("Please Enter Your Weight in (lbs)");
               int User_Weight = scan.nextInt();
               System.out.println("Please Enter Your Height in (in)");
               int User_Height = scan.nextInt();
                System.out.println(BMICalculation.BMI_Imperial(User_Weight,User_Height));
                break;
            case "M":
                System.out.println("Please Enter Your Weight in (kg)");
                 User_Weight = scan.nextInt();
                System.out.println("Please Enter Your Height in (cm)");
                 User_Height = scan.nextInt();
                System.out.println(BMICalculation.BMI_Metric(User_Weight,User_Height));
                break;
            default :
                System.out.println("Neither I or M Selected");
                System.exit(0);
        }

    }
}
