/// My Game conditions
///Player 1 or player 2 will not enter the game unless and until they get 1 or 6 on dice
///If someone get 1 or 6 at very first instance he enters the game and he will roll the dice once again
///If any one of the player do not want to roll the dice that player will be considered as he quit the game.And another player will win the game
///If any player is on 96 and he got ladder such that he got (5/6) on dice then he can't move as score reaches greater than 100
///Hoorray ...Chill and enjoy the game
///If you got the snake and because of it if player socre is getting 0 or less than 0 then player score is set to be equal to 1




package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class Application {
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random random =new Random();
    System.out.println("Welcome to the Snake and Ladder Game");
    Scanner scan=new Scanner(System.in);
    
    int diceOutput=0;
    int playerScore1=0;
    int playerScore2=0;
    int playerIdentity=1;
    int noOfRoll=0;
    while(true) {
    	
    if(playerScore1==100 || playerScore2==100) {
    	break;
    }
    noOfRoll+=1;
    System.out.println("Do you want to roll dice(0/1):");
    
    int b=scan.nextInt();
    if(b==1) {
    	diceOutput=random.nextInt(6)+1;
    	System.out.println("You got "+diceOutput);
    	if(playerScore1==0 && playerScore2==0) {
    	   	if(diceOutput!=1 && diceOutput!=6) {
        		System.out.println("You got " + diceOutput+" So No play");
        		
        		if (playerIdentity==1) {
        			System.out.println("Score of player"+playerIdentity+ " is "+playerScore1);
        			playerIdentity=2;
        			System.out.println("It is the turn of player "+ playerIdentity);
        		}
        		else {
        			System.out.println("Score of player "+playerIdentity+ " is "+playerScore2);
        			playerIdentity=1;
        			System.out.println("It is the turn of player "+playerIdentity);
        		}
        	}
        	else {
        		
        		System.out.println("You got"+ diceOutput +" & You entered the game");
        		if(playerIdentity==1) {
        		playerScore1+=1;
        		System.out.println("Player1 score :"+playerScore1);}
        		else {
        			playerScore2+=1;
        			System.out.println("Player2 score :"+playerScore2);
        		}
        	}
    	}
    	else if(playerScore1!=0 && playerScore2==0) {
	    		if (playerIdentity==1) {
	    			//Yahape player 1 keliye random dice wala bharde
	    			int randomOutput=random.nextInt(3);
	    			if(randomOutput==0) {
	    				if((playerScore1+diceOutput)>100) {
	    					System.out.println("Your can't move because your score reaches greater then 100");
	    					System.out.println("Player 1 score "+playerScore1);
	    				}
	    				else {
	    				System.out.println("You got the ladder.Move "+diceOutput+" step forward");
	    				playerScore1+=diceOutput;
	    			    System.out.println("Player 1 score "+playerScore1);
	    				}
	    				}
	    			else if(randomOutput==1) {
	    				System.out.println("You got the snake. Move "+diceOutput+" step backward");
	    				playerScore1-=diceOutput;
	    				if (playerScore1<=0) {
	    					playerScore1=1;
	    				}
	    				System.out.println("Player 1 score "+playerScore1);
	    			}
	    			else {
	    				System.out.println("You got no play");
	    				System.out.println("Player 1 score "+playerScore1);
	    			}
	    		playerIdentity=2;
	    		if(playerScore1!=100) {
	    		System.out.println("It is the turn of player "+playerIdentity);}
	    		}
	    		else {
	    			//Yahape player 2 keliye ranom dice wala bharde
	    			if(diceOutput!=1 && diceOutput!=6) {
	            		System.out.println("You got "+diceOutput+" So No play");
	            		System.out.println("Player 2 score"+playerScore2);
	            		playerIdentity=1;
	            		if(playerScore2!=100){
	            		System.out.println("It is the turn of player "+playerIdentity);}
	            		}
	    			else {
	    				System.out.println("You got"+ diceOutput +" & You entered the game");
	    				playerScore2+=1;
	    				System.out.println("Player 2 score "+playerScore2);
	    			}
	    		}
    	}
    	else if(playerScore1==0 && playerScore2!=0) {
	    		if(playerIdentity==1) {
	    			//yahape player 1 keliye random dice wala bharde
	    			if(diceOutput!=1 && diceOutput!=6) {
	            		System.out.println("You got "+diceOutput+" So No play");
	            		System.out.println("Player 1 score"+playerScore1);
	            		playerIdentity=2;
	            		if(playerScore1!=100) {
	            		System.out.println("It is the turn of player "+playerIdentity);}
	            		}
	    			else {
	    				System.out.println("You got"+ diceOutput +" & You entered the game");
	    				playerScore1+=1;
	    				System.out.println("Player 1 score "+playerScore1);
	    			}
	    		}
	    		else {
	    			//yahape player 2 keliye random dice wala bharde
	    			int randomOutput=random.nextInt(3);
	    			if(randomOutput==0) {
	    				if((playerScore2+diceOutput)>100) {
	    					System.out.println("You can't move your score reaches greater than 100");
	    					 System.out.println("Player 2 score "+playerScore2);
	    				}
	    				else {
	    				System.out.println("You got the ladder.Move "+diceOutput+" step forward");
	    				playerScore2+=diceOutput;
	    			    System.out.println("Player 2 score "+playerScore2);
	    			    }
	    				}
	    			else if(randomOutput==1) {
	    				System.out.println("You got the snake. Move "+diceOutput+" step backward");
	    				playerScore2-=diceOutput;
	    				if (playerScore2<=0) {
	    					playerScore2=1;
	    				}
	    				System.out.println("Player 2 score "+playerScore2);
	    			}
	    			else {
	    				System.out.println("You got no play");
	    				System.out.println("Player 2 score "+playerScore2);
	    			}
	    			playerIdentity=1;
	    			if(playerScore2!=100) {
	    			System.out.println("It is the turn of player "+playerIdentity);}
	    		}
    	}
    	
    	else {
	    		if(playerIdentity==1) {
	    			//yahape player 1 keliye random dice wala bharde
	    			int randomOutput=random.nextInt(3);
	    			if(randomOutput==0) {
	    				if((playerScore1+diceOutput)>100) {
	    					System.out.println("You can't move because your score reaches greater than 100");
	    					 System.out.println("Player 1 score "+playerScore1);
	    				}
	    				else {
	    					System.out.println("You got the ladder.Move "+diceOutput+" step forward");
		    				playerScore1+=diceOutput;
		    			    System.out.println("Player 1 score "+playerScore1);
	    				}
	    				
	    				}
	    			else if(randomOutput==1) {
	    				System.out.println("You got the snake. Move "+diceOutput+" step backward");
	    				playerScore1-=diceOutput;
	    				if (playerScore1<=0) {
	    					playerScore1=1;
	    				}
	    				System.out.println("Player 1 score "+playerScore1);
	    			}
	    			else {
	    				System.out.println("You got no play");
	    				System.out.println("Player 1 score "+playerScore1);
	    			}
	    		playerIdentity=2;
	    		if(playerScore1!=100) {
	    		System.out.println("It is the turn of player "+playerIdentity);}
	    		}
	    		else {
	    			//yahape player 2 keliye random dice wala bharde
	    			int randomOutput=random.nextInt(3);
	    			if(randomOutput==0) {
	    				if((playerScore2+diceOutput)>100) {
	    					System.out.println("You can't move because your score reaches greater than 100"); 
	    					System.out.println("Player 2 score "+playerScore2);
	    				}
	    				else {
	    					System.out.println("You got the ladder.Move "+diceOutput+" step forward");
		    				playerScore2+=diceOutput;
		    			    System.out.println("Player 2 score "+playerScore2);
	    				}
	    				
	    				}
	    			else if(randomOutput==1) {
	    				System.out.println("You got the snake. Move "+diceOutput+" step backward");
	    				playerScore2-=diceOutput;
	    				if (playerScore2<=0) {
	    					playerScore2=1;
	    				}
	    				System.out.println("Player 2 score "+playerScore2);
	    			}
	    			else {
	    				System.out.println("You got no play");
	    				System.out.println("Player 2 score "+playerScore2);
	    			}
	    			playerIdentity=1;
	    			if(playerScore2!=100) {
	    			System.out.println("It is the turn of player "+playerIdentity);}
	    		}
    	    }
    	 }
    else if(b==0) {
    	if (playerIdentity==1) {
    		System.out.println("Player 1 Quit ,Player 2 won");
    		
    	}
    	else {
    		System.out.println("Player 2 Quit ,Player 1 won");
    	}
    	break;
    }
    else {
    	System.out.println("Enter valid command");
    }
    	
    }
    if(playerScore1==100) {
    	System.out.println("Player 1 won the game");
    }
    else if(playerScore2==100){
    	System.out.println("Player 2 won the game");
    }
    System.out.println("No of dice roll: " +noOfRoll);
    
	}
	}