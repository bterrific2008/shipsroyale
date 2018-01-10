package gui;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoardPanel extends JPanel implements MouseListener{
	public BoardPanel() {};
	public int margin = 10;
	
	
	@Override
	public void paint(Graphics g) {
		int width = this.getWidth();		//width of board game panel
		int height = this.getHeight();		//height of board game panel
		
		makeGrid(width, height, g);

	}
	
	private void makeGrid(int width, int height, Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int block = (width-(2*margin))/10;	//each individual brick
		g2.setStroke(new BasicStroke(3));
		
		for(int w = margin; w <= width; w = w+block) {
			g2.drawLine(w, margin, w, height-margin);
			g2.drawLine(margin, w, width-margin, w);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("x: "+e.getX()+", y: "+e.getY());
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
