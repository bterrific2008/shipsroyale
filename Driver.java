import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import battleship.*;
import battleship.Ship.Directions;
import gui.*;
import board.*;

public class Driver {

	public static void main(String args[]){
		JFrame frame = new JFrame();
		JPanel panel = new BoardPanel();
		
		Ship ship = new Ship(10, 0, Directions.HORIZONTAL, 4);
		ShipSection[] sections = ship.getSections();
		
		for(ShipSection s:sections){
			System.out.println(s.getX()+" "+s.getY());
		}
		
		Dimension preferredDimension = new Dimension(1000, 1000);
		panel.setPreferredSize(preferredDimension);
		
		frame.setResizable(true);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
}

	

