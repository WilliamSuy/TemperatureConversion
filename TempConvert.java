/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {
        selection();
        repeat();
    }
    
    public static void selection() {
        Scanner input = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to: ");
        System.out.println("^\t\tTemperature Conversion");
        System.out.println("^\t\t\t\t\tby William J. Suy");
        System.out.println("^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.println("\nIf converting from Fahrenheit to Celsius, key in \'1\'");
        System.out.println("If converting from Fahrenheit to Kelvin, key in \'2\'");
        System.out.println("If converting from Celsius to Fahrenheit, key in \'3\'");
        System.out.println("If converting from Celsius to Kelvin, key in \'4\'");
        System.out.println("If converting from Kelvin to Fahrenheit, key in \'5\'");
        System.out.println("If converting from Kelvin to Celsius, key in \'6\'");
        
        byte choice = 0;
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && 
                choice != 5 && choice != 6) {
            System.out.print("Please choose your preferred conversion: ");
            choice = input.nextByte();
            switch (choice) {
                case 1:
                    fahrenheitToCelsius();
                    break;
                case 2:
                    fahrenheitToKelvin();
                    break;
                case 3:
                    celsiusToFahrenheit();
                    break;
                case 4:
                    celsiusToKelvin();
                    break;
                case 5:
                    kelvinToFahrenheit();
                    break;
                case 6:
                    kelvinToCelsius();
                    break;
            }   
        }
    }
    
    public static void repeat() {
        Scanner input = new Scanner(System.in);
        String choice = "";
        
        do {
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("\nWould you like to do another conversion? (yes or no): ");
            choice = input.next();
        }
        while (!"yes".equalsIgnoreCase(choice) && !"no".equalsIgnoreCase(choice));
        
        if ("yes".equalsIgnoreCase(choice)) {
            selection();
            repeat();
        }
        
        if ("no".equalsIgnoreCase(choice)) {
            System.out.println("\nThank you for using my program!");
        }
    }
    
    public static void fahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("\nPlease enter the temperature in Fahrenheit: ");   
        double fahrenheit = input.nextDouble();
        double celsius = (5.0/ 9) * (fahrenheit - 32);
            
        System.out.format("%4.3f", fahrenheit);
        System.out.print(" degrees Fahrenheit equates to ");
        System.out.format("%4.3f", celsius);
        System.out.println(" degrees Celsius.");
    }
    
    public static void fahrenheitToKelvin() {
        Scanner input = new Scanner(System.in);        
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("\nPlease enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double kelvin = (fahrenheit + 459.67) * (5.0/ 9 );
            
        System.out.format("%4.3f", fahrenheit);
        System.out.print(" degrees Fahrenheit equates to ");
        System.out.format("%4.3f", kelvin);
        System.out.println(" degrees Kelvin.");
    }
    
    public static void celsiusToFahrenheit() {
        Scanner input = new Scanner(System.in); 
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("\nPlease enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9.0/ 5) + (32);
            
        System.out.format("%4.3f", celsius);
        System.out.print(" degrees Celsius equates to ");
        System.out.format("%4.3f", fahrenheit);
        System.out.println(" degrees Fahrenheit.");
    }
    
    public static void celsiusToKelvin() {
        Scanner input = new Scanner(System.in); 
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("\nPlease enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        double kelvin = (celsius + 273.15);
            
        System.out.format("%4.3f", celsius);
        System.out.print(" degrees Celsius equates to ");
        System.out.format("%4.3f", kelvin);
        System.out.println(" degrees Kelvin.");        
        
    }
    
    public static void kelvinToFahrenheit() {
        Scanner input = new Scanner(System.in); 
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("\nPlease enter the temperature in Kelvin: ");
        double kelvin = input.nextDouble();
        double fahrenheit = (9.0/ 5 ) * (kelvin - 273) + (32);
            
        System.out.format("%4.3f", kelvin);
        System.out.print(" degrees Kelvin equates to ");
        System.out.format("%4.3f", fahrenheit);
        System.out.println(" degrees Fahrenheit.");
    }
    
    public static void kelvinToCelsius() {
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter the temperature in Kelvin: ");
        double kelvin = input.nextDouble();
        double celsius = (kelvin - 273);
            
        System.out.format("%4.3f", kelvin);
        System.out.print(" degrees Kelvin equates to ");
        System.out.format("%4.3f", celsius);
        System.out.println(" degrees Celsius.");
        
    }
}
