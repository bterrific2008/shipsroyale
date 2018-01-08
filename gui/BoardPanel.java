package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import battleship.Ship;
import battleship.ShipSection;
import battleship.Ship.Directions;

public class BoardPanel extends JPanel{
	Ship ship;
	
	public BoardPanel() {
		ship = new Ship(9, 0, Directions.HORIZONTAL, 4);
		
		ShipSection[] sections = ship.getSections();
		
		for(ShipSection s:sections){
			System.out.println(s.getX()+" "+s.getY());
		}
	};
	
	@Override
	public void paint(Graphics g) {
		int width = this.getWidth();		//width of board game panel
		int height = this.getHeight();		//height of board game panel
		makeGrid(width, height, g);
	}
	
	private void makeGrid(int width, int height, Graphics g) {
		g.drawRect(0, 0, width, height);;
	}
}
