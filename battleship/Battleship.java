package battleship;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import board.*;

public class Battleship {

	private Board oneSetup, twoSetup, oneDisplay, twoDisplay;
	private int turnSeq = 0, subSeq = 0;
	private ArrayList<BufferedImage> sprites;

	public Battleship(){

		spriteLoader();

		oneSetup = new Board(10, 10);
		oneSetup.placePiece(1, 2, sprites.get(0));
		twoSetup = new Board(10, 10);
		oneDisplay = new Board(10, 10);
		twoDisplay = new Board(10, 10);
	}

	private boolean spriteLoader(){
		sprites = new ArrayList<BufferedImage>();
		try{
			sprites.add(ImageIO.read(Battleship.class.getResource("/images/bs.png")));

		}
		catch(IOException e){
			return false;
		}
		return true;
	}

	public void clk(int x, int y){
		System.out.println("HELLO");
		switch(turnSeq){
		case 0: oneSetup.placePiece(x, y, sprites.get(0)); break;
		case 1: break;
		case 2: break;
		case 3: break;
		}
	}

	private void nextTurn(){

	}

	

	public Board currentDisplay(){
		switch(turnSeq){
		case 0: break;
		case 1: break;
		case 2: break;
		case 3: break;
		}

		return oneSetup();
	}

	public Board oneSetup(){
		return oneSetup;
	}

	public Board twoSetup(){
		return twoSetup;
	}

	public Board oneDisplay(){
		return oneDisplay;
	}

	public Board twoDisplay(){
		return twoDisplay;
	}




}
