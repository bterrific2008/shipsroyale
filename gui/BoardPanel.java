package gui;

import java.awt.Graphics;
import javax.swing.JPanel;

public class BoardPanel extends JPanel{
	public BoardPanel() {};
	
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
