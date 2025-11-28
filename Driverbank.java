package LOLO;

import java.util.Scanner;

public class Driverbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);                      //creating a scanner object    
    	
    	Customer acc [] = new Customer[6];                          //creating srray to have 6 customer objects
    	
    	System.out.println("for 6 customers enter the name "        //asking for input
    			+ "and in the next line the balance");
    	
    	for(int i = 0; i <6; i++)                                   //using for-loop to read input of 6 customers
    	{
    		String name = scan.next();
    		double balance = scan.nextDouble();
    		
    		acc[i] = new Customer(name , balance);                  //creating new customer object and store it in the array
    	}
    	
    	System.out.println("\n\nsearch for all customers"             
    			+ " who have less than 150$");
    	
    	for (Customer c : acc)                                      //checking for customers who have lees than 150
    	{
    		if(c.getbalance() < 150)                                //going through all customers with if statement,
    		{                                                       //and print the result if the statement is true
    			System.out.println(c.getName()
    					);
    		}
    	}
    	
    	double sum = 0;                                              //calculating the average balance
    	
    	for(int i = 0; i < acc.length; i++)                          //loop through customers and adding their current,
    	{
    		sum += acc[i].getbalance();                              //balance to the total sum
    		
    	}
    	double average = sum/ acc.length;                            //getting average: sum /6
    	
    	System.out.println("\n\nthe average balance is : " 
    	+ average);                                                  //printing result
    	
    	Customer highest = acc[0];                                   //initializing highest and lowest
    	Customer lowest = acc[0];
    	
    	for(int i = 0 ; i < acc.length; i++)
    	{                                                            //loop through customrs and comparing them, 
    		if(acc[i].getbalance() > highest.getbalance())           //to see which one has higher balance
    		{
    			highest = acc[i];
    		}
    		
    		if(acc[i].getbalance() < lowest.getbalance())            //loop through customrs and comparing them,
    		{                                                        //to see which one has higher balance  
    			lowest = acc[i];
    		}
    	}
    		System.out.println("\nthe customer with the "            //printing results
    				+ "highest balance is: "+ highest.getName());
    		
    		System.out.println("\nthe customer with the "
    				+ "lowest balance is: "+ lowest.getName());
    		
    		System.out.println("\nshow all accounts after"
    				+ " a 15% balance increase");
    		
    	for( Customer c : acc)                                       //applying 15% balance increse to all the accounts       
    	{
    		c.addpercentage(15);
    		System.out.printf("%-10s has $" , c.getName());          //printing result
    		System.out.println(c.getbalance());
    	}
    	
	}

}
