package com.prog2.labs;
import java.util.Scanner;
/**
 * @author adinashby
 *
 */
public class LabTwo {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
         
	public static void main(String[] args) {
           //
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
	public double calcAmountOfShipping(double costOfPurchase) {
		double shippingCost;
                if (costOfPurchase <= 20) {
            shippingCost = 5.99;
        } else if (costOfPurchase <= 65) {
            shippingCost = 10.99;
        } else {
            shippingCost = 15.99;
        }
		
		return shippingCost;
	}
	
	
	public String findPrimeNumbersUptoInput(int input) {
            String answer = "";
            for (int i = 2; i <= input; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
               //String answer = i + " ";
               answer = answer + i + " ";
            //return answer;
            }
        }
        
        return answer.trim();
        }	
		//return i + "";
	//}
	
	public String generateShape(int numberOfRows) {
	int number = 1;
        String result = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                result += number + " ";
                ++number;
            }
            result = result.strip();
            result += "\n";
        }
        return result.strip();
		
		
	}
	
	/**
	 * 4) Complete the Account class (see inside the class for instruction). 
	 * 
	 */

}
