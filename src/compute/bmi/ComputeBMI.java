/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute.bmi;
/**
 *
 * @author Munam
 */

import java.util.Scanner;
public class ComputeBMI {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter wiehgt in pounds
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359257;
        final double METERS_PER_INCH = 0.0254;
        
        //calculate BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        System.out.printf("Your BMI is ", bmi);
           
        if (bmi < 16)
               System.out.println("You are seriously underweight");
        
        else if (bmi < 18)
               System.out.println("You are underweight");
        
        else if (bmi < 24)
               System.out.println("You are normal weight");
        
        else if (bmi < 29)
               System.out.println("You are overweight");
        
        else if (bmi < 35)
               System.out.println("You are seriously overweight");
        
        else 
               System.out.println("You are gravely overweight");
        
       
               
                
                
                
                
                
                
                
        
                
                
        
    }
    
}
