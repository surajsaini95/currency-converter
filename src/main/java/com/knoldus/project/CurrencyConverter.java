package com.knoldus.project;

public class CurrencyConverter{
	
	public double convertFromEUR(String currencyTo,double amount){

		if(currencyTo.equals("USD"))
			return amount*1.1004;
		else if(currencyTo.equals("CAD"))
			return amount*1.4498;
		else if(currencyTo.equals("AUD"))
			return amount*1.6301;
		else if(currencyTo.equals("INR"))
			return amount*78.405;
		else if(currencyTo.equals("EUR"))
			return amount;
		else 
		{   
			System.out.println("==============================================================");
        	System.out.println("Invalid currencyTo");
		}
	return -1;
	}

	public double convertFromAUD(String currencyTo,double amount){

		if(currencyTo.equals("USD"))
			return amount*0.675;
		else if(currencyTo.equals("CAD"))
			return amount*0.8894;
		else if(currencyTo.equals("EUR"))
			return amount*0.6135;
		else if(currencyTo.equals("INR"))
			return amount*48.094;
		else if(currencyTo.equals("AUD"))
			return amount;
		else 
		{   
			System.out.println("==============================================================");
        	System.out.println("Invalid currencyTo");
		}
	return -1;
	}

	public double convertFromUSD(String currencyTo,double amount){

		if(currencyTo.equals("AUD"))
			return amount*1.4814;
		else if(currencyTo.equals("CAD"))
			return amount*1.3175;
		else if(currencyTo.equals("EUR"))
			return amount*0.9088;
		else if(currencyTo.equals("INR"))
			return amount*71.245;
		else if(currencyTo.equals("USD"))
			return amount;
		else 
		{   
			System.out.println("==============================================================");
        	System.out.println("Invalid currencyTo");
		}
	return -1;
	}

	public double convertFromINR(String currencyTo,double amount){

		if(currencyTo.equals("USD"))
			return amount*0.014;
		else if(currencyTo.equals("CAD"))
			return amount*0.0185;
		else if(currencyTo.equals("EUR"))
			return amount*0.0128;
		else if(currencyTo.equals("AUD"))
			return amount*0.0208;
		else if(currencyTo.equals("INR"))
			return amount;
		else 
		{   
			System.out.println("==============================================================");
        	System.out.println("Invalid currencyTo");
		}
	return -1;
	}

	public double convertFromCAD(String currencyTo,double amount){

		if(currencyTo.equals("USD"))
			return amount*0.759;
		else if(currencyTo.equals("AUD"))
			return amount*1.1244;
		else if(currencyTo.equals("EUR"))
			return amount*0.6898;
		else if(currencyTo.equals("INR"))
			return amount*54.0759;
		else if(currencyTo.equals("CAD"))
			return amount;
		else 
		{   
			System.out.println("==============================================================");
        	System.out.println("Invalid currencyTo");
		}
	return -1;
	}

}