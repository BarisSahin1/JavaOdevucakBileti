/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOdev;

import java.util.Scanner;

/**
 *
 * @author bsahi
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int distance,age,passengerType;
        float price=0;
        
        System.out.println("Please enter your age");
            
        age = scanner.nextInt();
        if(age < 0){
            System.out.println("Please enter positive number :");
            age = scanner.nextInt();
        }
        System.out.println("Please enter flight distance in terms of KM :");
         distance = scanner.nextInt();
        if(distance < 0){
            System.out.println("Please enter positive number.");
            distance = scanner.nextInt();
        }
        System.out.println("Please enter passengertype 1-> one-way ticket 2-> round-trip ticket"); 
        passengerType = scanner.nextInt();
        if(passengerType > 2 || passengerType <= 0){
            System.out.println("Please enter 1 or 2.");
            passengerType = scanner.nextInt();
        }
        
        price = (float) (distance * 0.1);
        
        if(age<12){
            System.out.println("Normal price :" + price);
            price = (float) (distance * 0.1)/2;
            System.out.println("Price with discount :" + price);
        }
        else if(age >=12 && age <=24){
            System.out.println("Normal price :" + price);
            price = (float) (distance * 0.1)*9/10;
            System.out.println("Price with age discount :" + price);
        }
        else if(age >= 65){
            System.out.println("Normal price :" + price);
            price = (float) (distance * 0.1)*7/10;
            System.out.println("Price with discount :" + price);
        }
        
        if(passengerType == 2){
            price = price * 8 / 10;
            System.out.println("Price for type 2 passengers :" + 2*price);
        }
        
        else System.out.println("Price is : " + price);
    }
    
}
