package board;

import java.awt.image.BufferedImage;

public class Board {
	
	Object[][] board;
	
	public Board(int x, int y){
		board = new Object[x][y];

		
	}
	
	public boolean placePiece(int x, int y, Object piece){
		if(isValid(x, y, piece)){
			System.out.println(board[x][y]);

			System.out.println("HELLO!!!");
			board[x][y] = piece;	
			System.out.println(board[x][y]);
			return true;
		}
		return false;
	}
	
	public Object replacePiece(int x, int y, Object piece){
		Object orig = board[x][y];
		board[x][y] = piece;
		return orig;
	}
	
	private boolean isValid(int x, int y, Object obj){
		if(obj == null)
			return false;
		if(x >= board.length || y >= board.length)
			return false;
		if(x < 0 || y<0)
			return false;
		return true;
	}

	public Object getPiece(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= board.length || y >= board[0].length || x < 0 || y < 0)
			return null;
		return board[x][y];
	}
	
}
