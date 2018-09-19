/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise2_2;

import java.util.Scanner;

/**
 *
 * @author marcosalopez
 */
public class Excercise2_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        //Convert Fahrenheit to Celcius
        double celcius = (5.0/9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celcius + " in Celcius");
        // TODO code application logic here
    }
    
}
