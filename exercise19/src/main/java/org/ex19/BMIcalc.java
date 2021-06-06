package org.ex19;

import java.util.Scanner;

public class BMIcalc {
    public static void main(String[] args) {
        //bmi = (weight / (height × height)) * 703

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = scanner.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = scanner.nextFloat();

        float bmi = (weight / (height * height)) * 703;
        System.out.print("Your bmi is "+ bmi);

        if(bmi >= 18.2 && bmi <= 25 ){
            System.out.print("\nYou are within ideal weight range");
        }
        else if (bmi < 18.2){
            System.out.print("\nYou are underweight. You should go see your doctor.");
        }
        else if (bmi > 25){
            System.out.print("\nYou are overweight. You should go see your doctor.");
        }

    }

}
