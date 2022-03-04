package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class Application {
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random random =new Random();
    System.out.println("Welcome to the Snake and Ladder Game");
    Scanner scan=new Scanner(System.in);
    
    int dieOutput=0;
    int playerScore1=0;
   
    while(dieOutput!=1 && dieOutput!=6) {
  
    System.out.println("Do you want to roll die(0/1):");
    int b=scan.nextInt();
    if(b==1) {
    	dieOutput=random.nextInt(6)+1;
    	System.out.println("You got "+dieOutput);
    	if(dieOutput!=1 && dieOutput!=6) {
    		System.out.println("No play");
    	}
    	else {
    		System.out.println("You entered the game");
    		playerScore1+=1;
    		System.out.println("Player1 score :"+playerScore1);
    	}
    	 }
    else {
    	break;
    }
    	
    }
    
	}
	}