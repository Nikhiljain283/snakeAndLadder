package com.snakeladder;

public class DicePLayedTimes {
	public static void main(String[] args) {
		
		final int noPlay = 1;
		final int ladder = 2;
		final int snake = 3;
		int playerPosition = 0;
		int diceRolled = 0;
		
		while(playerPosition < 100 ){
			
			int check = (int)(Math.random()*3)+1;
			int diceNum = (int)(Math.random()*6)+1;
			diceRolled++;
			System.out.println("Number appeared on dice : "+diceNum);
			
			switch(check) {
				case noPlay :
					System.out.println("player position : "+playerPosition);
					break;
				case ladder :
					if(playerPosition + diceNum <= 100)
					playerPosition+=diceNum;
					System.out.println("player position : "+playerPosition);
					break;
				case snake :
					playerPosition -= diceNum;
					if(playerPosition-diceNum < 0) {
						playerPosition = 0;
					}
					System.out.println("player position : "+playerPosition);
					break;
			}
		}
		System.out.println("Number of times dice wad rolled : "+diceRolled);
	}

}
