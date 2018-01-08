import java.awt.Dimension;

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
		
<<<<<<< HEAD
<<<<<<< HEAD
		
		
		
		Dimension preferredDimension = new Dimension(1000, 1000);
=======
		Dimension preferredDimension = new Dimension(700, 700);
>>>>>>> GUI
		panel.setPreferredSize(preferredDimension);
		frame.setResizable(true);
=======
		Dimension preferredDimension = new Dimension(1000, 1000);
		panel.setPreferredSize(preferredDimension);
		
>>>>>>> refs/remotes/origin/master
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
}

	

