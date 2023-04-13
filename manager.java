package ticTacToe;

import java.util.Scanner;

public class manager {
private Player player1,player2;
private Board board;
private int playerNumber;
	public static void main(String[] args) {
     manager m = new manager();
     m.startGame();
    
	}
public void startGame() {
	Scanner s = new Scanner(System.in);
	//take player input
    player1 = takeInput(++playerNumber);
    player2 = takeInput(++playerNumber);
    //check symbol
    while(player1.getSymbol() == player2.getSymbol()) {
    	System.out.println("symbol Already taken enter new symbol");
    	player2.setSymbol(s.next().charAt(0));
    }
    //create board
    board = new Board(player1.getSymbol(),player2.getSymbol());
    //play the Game
    boolean player1Turn = true;
    int status = Board.INCOMPLETE;
    while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE) {
    	if(player1Turn) {
    		System.out.println("player1"+" "+player1.getName()+" "+"s turn");
    		System.out.println("Enter x:");
    		int x = s.nextInt();
    		System.out.println("Enter y:");
    		int y = s.nextInt();
    	 status = board.move(player1.getSymbol(),x,y);
    	if(status == Board.INVALIDMOVE) {
    		System.out.println("invalid move!! please try again!!");
    		continue;
    	}
    	
    	}
    	else {
    		System.out.println("player2"+" "+player2.getName()+" "+"s turn");
    		System.out.println("Enter x:");
    		int x = s.nextInt();
    		System.out.println("Enter y:");
    		int y = s.nextInt();
    	 status = board.move(player2.getSymbol(),x,y);
    	if(status == Board.INVALIDMOVE) {
    		System.out.println("invalid movie !! please try again!!");
    		continue;
    	}
    	
    	}
    	player1Turn = !player1Turn;
    	board.print();
    }
    if(status == Board.PLAYER1WIN) {
    	System.out.println("player1"+" "+player1.getName()+" "+"won");
    }
    else if(status == Board.PLAYER2WIN) {
    	System.out.println("player2"+" "+ player2.getName()+" "+"won");
    }
    else {
    	System.out.println("draw!!");
    }
    
}
public Player takeInput(int num) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter player"+" "+num+" "+"name:");
	String name = s.nextLine();
   System.out.println("Enter player"+" "+num+" "+"symbol:");
   char symbol = s.next().charAt(0);
   Player p = new Player(name,symbol);
   return p;
}
}
