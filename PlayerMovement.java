package com.snakeladder;

public class PlayerMovement {
	public static void main(String[] args) {
		
		int playerPosition = 0;
		
		int check = (int)(Math.random()*3)+1;
		int diceNum = (int)(Math.random()*6)+1; 
		
		switch(check) {
		case 1 :
			System.out.println("No play, player position "+playerPosition);
			break;
		case 2 :
			playerPosition += diceNum;
			System.out.println("ladder : player position : "+playerPosition);
			break;
		case 3 :
			playerPosition -= diceNum;
			System.out.println("snake : player position : "+playerPosition);
			break;
				
		}
	}

}