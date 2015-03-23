package gui;
import javax.swing.JFrame;

import battleship.Battleship;
import board.*;


public class BoardFrame extends JFrame{

	public BoardFrame(Battleship bat, String title){
		super(title);
		this.add(new BoardPanel(bat));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.validate();
		this.setResizable(true);
	}

	

	
}
