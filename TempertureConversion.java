/*
 This program is to convert temperature from Fahrenheit to Celsius or vice versa based on the input that the user inputs
 */
package tempertureconversion;

/**
 *
 * @author William_Suy
 */

//importing Scanner
import java.util.Scanner;


public class TempertureConversion {

    public static void main(String[] args) {
        
        //Creates a scanner object
        Scanner input = new Scanner(System.in);
        
        //Introduction to the program and prompts user to enter values
        System.out.println("Welcome to Temperature Conversions.\n");
        System.out.println("Please choose your preferred conversion:");
        
        System.out.println("If converting from Fahrenheit to Celsius, key in \'1\'");
        System.out.println("If converting from Fahrenheit to Kelvin, key in \'2\'");
        System.out.println("If converting from Celsius to Fahrenheit, key in \'3\'");
        System.out.println("If converting from Celsius to Kelvin, key in \'4\'");
        System.out.println("If converting from Kelvin to Fahrenheit, key in \'5\'");
        System.out.println("If converting from Kelvin to Celsius, key in \'6\'");
        
        //Asks user to input '1' for Fahrenheit to Celsius and '2' for Celsius to Fahrenheit 
        System.out.print("\nConversion choice: ");
        double choice = input.nextDouble();
        
        //If & Else statement with If to be the Fahrenheit to Celsius conversion and Else to be Celsius to Fahrenheit
        if (choice == 1) {
            
            //if the user chooses '1', user will now be prompted to enter a value in Fahrenheit to Celsius conversion
            System.out.print("\nPlease enter the temperature in Fahrenheit: ");
            
            //Stores the variable fahrenheit from the input of the user 
            double fahrenheita = input.nextDouble();
            
            //Stores the variable of the value of the Celsisu conversion from the input of the user
            double celsiusa = (5.0/ 9) * (fahrenheita - 32);
            
            //Prints out the conversion of Fahrenheit to Celsius
            System.out.println("\n" + fahrenheita + " degrees Fahrenheit equates to " + celsiusa + " degrees.");
            
        }
        if (choice == 2) {
            
            //if the user inputs '2', the program will convert from Fahrenheit to  Kelvin
            System.out.print("\nPlease enter the temperature in Fahrenheit: ");
            
            //Stores the data for Fahrenheit to Kelvin
            double fahrenheitc = input.nextDouble();
            
            //Stores the value for Fahrenheit to Kelvin
            double kelvina = (fahrenheitc + 459.67) * (5.0/ 9 );
            
            //Prints out the conversion from Fahrenheit to Kelvin
            System.out.println("\n" + fahrenheitc + " degrees Fahrenheit equates to " + kelvina + " degrees Kelvin");
            
        }
        else if (choice == 3) {
            
            //if the user inputs '3' , the program will calculate the conversion from Celsius to Fahrenheit
            System.out.print("\nPlease enter the temperature in Celsius: ");
            
            //Stores the variable of the else statement's celsisus in CelsiusB
            double celsiusb = input.nextDouble();
            
            //Stores t
            double fahrenheitb = (celsiusb * 9.0/ 5) + (32);
            
            //Prints out the converstion of Celsius to fahrenheit
            System.out.println("\n" + celsiusb + " degrees Celsius equates to " + fahrenheitb + " degrees fahrenheit");
            
        }
        else if (choice == 4) {
            
            //if the user inputs '4', the program will convert from Celsius to Kelvin
            System.out.print("\nPlease enter the temperature in Celsius: ");
            
            //Stores the data for Celsius to Kelivn conversion
            double celsiusc = input.nextDouble();
            
            //Stores the data value for the conversion to Kelvin from Celsius
            double kelvinb = (celsiusc + 273.15);
            
            //Prints out the conversion from Celsius to Kelvin
            System.out.println("\n" + celsiusc + " degrees Celsius equates to " + kelvinb + " degrees Kelvin");
            
        }
        else if (choice == 5) {
            
            //if the user inputs '5', the program will covert from Kelvin to Fahrenheit
            System.out.print("\nPlease enter the temperature in Kelvin: ");
            
            //stores the data of Kelvin to Fahrenheit 
            double kelvinc = input.nextDouble();
            
            //stores the data of the conversion from Kelvin to Fahrenheit
            double fahrenheitd = (9.0/ 5 ) * (kelvinc - 273) + (32);
            
            //Prints out the conversion from Kelvin to Fahrenheit
            System.out.println("\n" + kelvinc + " degrees Kelvin equates to " + fahrenheitd + " degrees Fahrenheit");
            
        }
        else if (choice == 6) {
            
            //if the user inputs '6', the program will convert from Kelvin to Celcius
            System.out.print("\nPlease enter the temperature in Kelvin: ");
            
            //stores the data of Kelvin to Celsius
            double kelvind = input.nextDouble();
            
            //stores the data of Celsius from the conversion in Kelvin
            double celsiusd = (kelvind - 273);
            
            //Prints out the conversion from Kelvin to Celsius
            System.out.println("\n" + kelvind + " degrees Kelvin equates to " + celsiusd + " degrees Celsius");
            
        }
        else if (choice >= 6) {
            System.out.println("\nSorry, that's an incorrect key, please restart the program");
        }
    }
    
}
