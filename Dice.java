package lala;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                                                        //Melina Mohammadi
	                                                            //Student ID: 222496673

		Scanner scan = new Scanner(System.in);                                //import scanner
		Random generator = new Random();                                      //create Random object for rolling dice
		
		int player1=0;
		int player2=0;                                                        //initializing players
		int player3=0;
		boolean gameover = false;                                             //gameover initialized to false, 
		                                                                      //means game continues until gameover is true
		                                                            
		while(!gameover) {
			do {                                                              //game continues until one player reach 15
				int dice1 =generator.nextInt(6)+1;                            //first roll 1 to 6
				int dice2 =generator.nextInt(6)+1;                            //second roll 1 to 6
				
				player1 +=dice1 + dice2;                                      //player1 total score
				
				System.out.println("player 1 rolls a "+dice1+" and a "+dice2);
				System.out.println("player 1 now has "+player1);              //printing player1 total rolls and score
				
				if(player1 >= 15)
				{ 
					gameover= true;                                           // if player1 reached or passed 15 stop the game
				    break;                                                    
				}
				
				if(dice1 != dice2)                                            //if player1 rolls doubles he will roll again
					                                                          //otherwise, his turn ends
				    break;
			}
		
		while(true);
			    if(gameover)                                                  // if player2 reached or passed 15 stop the game
				    break;
			    
			    do {                                                           //game continues until one player reach 15
			    	int dice1 = generator.nextInt(6)+1;                        //first roll 1 to 6
			    	int dice2 = generator.nextInt(6)+1;                        //second roll 1 to 6              
			    	
			    	player2 +=dice1 + dice2;                                   //player2 total score
			    	
			    	System.out.println("player 2 rolls a "+dice1+" and a "+dice2);
					System.out.println("player 2 now has "+player2);           //printing player2 total rolls and score
					
					if(player2 >= 15)
					{ 
						gameover= true;
					    break;                                                 // if player2 reached or passed 15 stop the game
					}
					
					if(dice1 != dice2) 
					    break;                                                 //if player2 rolls doubles he will roll again
				}
			
		while(true);
				    if(gameover)
					    break;
				                                                               //game continues until one player reach 15
				  do {
				      int dice1 = generator.nextInt(6)+1;                      //first roll 1 to 6
				      int dice2 = generator.nextInt(6)+1;                      //second roll 1 to 6
				    	
				      player3 +=dice1 + dice2;                                 //player3 total score
				    	
				      System.out.println("player 3 rolls a "+dice1+" and a "+dice2);
					  System.out.println("player 3 now has "+player3);         //printing player3 total rolls and score
						
					if(player3 >= 15)
					{ 
						gameover= true;                                        // if player3 reached or passed 15 stop the game
						break;
					}
						
					if(dice1 != dice2)                                         //if player3 rolls doubles he will roll again
						break;
					}
				
		while(true);
					if(gameover)                                               //game continues until one player reach 15
						break;
			    	
			    }
		                                                                      //determine who won,who got second and who got third,
		int first= Math.max(player1,Math.max (player2, player3));             //using math.max, math.min to finding highest and lowest scores,
        int third= Math.min(player1,Math.min(player2, player3));              //substracting highest and lowest from total to get middle value,
        int second= player1 + player2 + player3 -(first + third);             //which is secoond place
                                                                               
		
		
                    if(player1 == first)                                      //compares each player’s score to the first score,
		                                                                      //then prints which one matches
		            	
		            	System.out.println("player1 wins the first place with a total of "+player1);
		            
		            if(player2 == first)                               
		            	System.out.println("player2 wins the first place with a total of "+player2);
		            	
		            if(player3 == first) 
		                System.out.println("player3 wins the first place with a total of " + player3);
		            
		            
		            if(first != second) {
		            	
	                    if(player1 == second)                                      //compares each player’s score to the second score,
	                                                                               //then prints which one matches
			            	System.out.println("player1 wins the second place with a total of "+player1);
			            
			            if(player2 == second)
			            	System.out.println("player2 wins the second place with a total of "+player2);
			            
			            if(player3 == second)
			            	System.out.println("player3 wins the second place with a total of "+player3);}
		            
		            
		            if(first != third && second != third) {
                    
		            	if(player1 == third)                                        //compares each player’s score to the first score,
                                                                                //then prints which one matches
		            	System.out.println("player1 wins the third place with the total of "+player1);
		           
		                if(player2 == third)
		            	System.out.println("player2 wins the third place with a total of "+player2);
		            
			            if (player3 == third) 
			            	System.out.println("player3 wins the third place with a total of "+player3);}
			            	
		          }
	}


   
