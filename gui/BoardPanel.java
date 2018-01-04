package gui;

import java.awt.Graphics;
import javax.swing.JPanel;

public class BoardPanel extends JPanel{
	public BoardPanel() {};
	public int margin = 10;
	
	@Override
	public void paint(Graphics g) {
		int width = this.getWidth();		//width of board game panel
		int height = this.getHeight();		//height of board game panel
		
		makeGrid(width, height, g);
	}
	
	private void makeGrid(int width, int height, Graphics g) {
		int xblock = (width-(2*margin))/10;
		int yblock = height/10;
		
		for(int w = margin; w <= width; w = w+xblock) {
			g.drawLine(w, margin, w, height-margin);
			g.drawLine(margin, w, width-margin, w);
		}
	}
}
