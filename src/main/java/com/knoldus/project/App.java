package com.knoldus.project;

import com.knoldus.project.CurrencyConverter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("==============================================================");
        System.out.println("\t\t\tCurrency Converter");
        System.out.println("==============================================================");
        System.out.println("\nChoose codes from below : ");
        System.out.println("\nEuropean euro\t\t:\tEUR");
        System.out.println("United States dollar\t:\tUSD");
        System.out.println("Canadian dollar\t\t:\tCAD");
        System.out.println("Australian dollar\t:\tAUD");
        System.out.println("Indian rupee\t\t:\tINR");
        
        Scanner scanner = new Scanner(System.in);
       	System.out.println("Enter currency code from which you want to convert : ");
        String currencyFrom = scanner.nextLine();
      	System.out.println("Enter currency code into which you want to convert : ");
        String currencyTo = scanner.nextLine();
 		System.out.println("Enter amount in "+currencyFrom+" : ");
        double amt = scanner.nextDouble();
      	CurrencyConverter cc=new CurrencyConverter();
    	double convertedAmt=0.0;

    	if(currencyFrom.equals("USD"))
    		convertedAmt=cc.convertFromUSD(currencyTo,amt);
		else if(currencyFrom.equals("EUR"))
    		convertedAmt=cc.convertFromEUR(currencyTo,amt);
		else if(currencyFrom.equals("CAD"))
    		convertedAmt=cc.convertFromCAD(currencyTo,amt);
		else if(currencyFrom.equals("AUD"))
    		convertedAmt=cc.convertFromAUD(currencyTo,amt);
		else if(currencyFrom.equals("INR"))
    		convertedAmt=cc.convertFromINR(currencyTo,amt);
		else
		{
			System.out.println("==============================================================");
            System.out.println("Invalid currencyFrom");
			convertedAmt=-1;
		}	
		if(convertedAmt!=-1)
        {	
            System.out.println("==============================================================");
            System.out.println(amt+" "+currencyFrom+" is equivalent to "+convertedAmt+" "+currencyTo);
            System.out.println("==============================================================");
        
        }
        else
        {
            System.out.println("Error in currency code");
            System.out.println("==============================================================");
        }
    }
}
