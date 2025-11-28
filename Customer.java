package LOLO;

public class Customer {
	
	
	private String name ;                                 //private attributes
	 private double balance;
	 
	 public Customer(String name , double balance)         //parametrized constructor
	 {
		 
		this.name = name;
		this.balance = balance;
		
	 }

	 
	 public void  addpercentage(double percent)            //method for increasing balance 
	 {
		 balance = balance + (balance * percent/ 100.0);   //calculating new balance
	 }
	 
	 
	 public double getbalance()                            //using getters for encapsulation
	 {
		 return balance;
	 }
	 
	 public String getName()                               //using getters for encapsulation
	 {
		 return name;
	 }
	 
	 public String toString()                              //using toString method to return name and balance,
	 {                                                     //in a formatted string
		 return name  +  " has "  +  balance;
	 }

}
