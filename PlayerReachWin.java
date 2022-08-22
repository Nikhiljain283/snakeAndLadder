package com.snakeladder;

public class PlayerReachWin {

	public static void main(String[] args) {
		
		int playerPosition = 0;
		
		while(playerPosition < 100) {
		
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
				if (playerPosition < 0)
				playerPosition = 0;
				System.out.println("snake : player position : "+playerPosition);
				
					
				break;
			}	
		}
	}
}
