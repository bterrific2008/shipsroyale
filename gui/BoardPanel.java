package gui;


import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.Rectangle;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import battleship.Battleship;
import board.Board;

public class BoardPanel extends JPanel{

	Battleship board;
	final int buffer = 10;
	final int imgBuffer = 5;

	int WIDTH = (this.getWidth()-buffer);
	int HEIGHT = (this.getHeight()-buffer);
	int HEIGHT_SIZE = (HEIGHT)/11;
	int WIDTH_SIZE = (WIDTH)/11;

	public BoardPanel(final Battleship bat) {
		this.board = bat;
		this.setPreferredSize(new Dimension(600, 600));

		this.repaint();

		KeyListener keylist = new MyKeyListener();
		MouseListener mouseList = new MyMouseListener();
		
		this.addKeyListener(keylist);
		this.addMouseListener(mouseList);
		
		this.setFocusable(true);

	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		WIDTH = (this.getWidth()-buffer);
		HEIGHT = (this.getHeight()-buffer);
		HEIGHT_SIZE = (HEIGHT)/11;
		WIDTH_SIZE = (WIDTH)/11;

		int xi = 0;
		int yi = 0;

		for(int x = buffer; x+WIDTH_SIZE< WIDTH; x+=WIDTH_SIZE){
			yi = 0;
			for(int y = buffer; y+HEIGHT_SIZE< HEIGHT; y+=HEIGHT_SIZE){
				g.drawRect(x, y, WIDTH_SIZE, HEIGHT_SIZE);
				g.drawImage(((BufferedImage)(board.currentDisplay().getPiece(xi, yi))), x+imgBuffer,
						y+imgBuffer, WIDTH_SIZE-imgBuffer, HEIGHT_SIZE-imgBuffer, null);
				yi = yi + 1;
			}
			xi = xi + 1;
		}

	}

	public class MyKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e){
			System.out.println(e.getKeyText(e.getKeyCode()));
		}

		@Override
		public void keyPressed(KeyEvent e){
			System.out.println(e.getKeyText(e.getKeyCode()));
		}

		@Override
		public void keyReleased(KeyEvent e){
			System.out.println(e.getKeyText(e.getKeyCode()));
		}

	}

	public class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent click){

			int y = ((click.getY()-buffer)/HEIGHT_SIZE);
			int x = ((click.getX()-buffer)/WIDTH_SIZE);

			if(x <= 10 && y <= 10)
				System.out.println(x+" "+y);
			board.clk(x, y);
			repaint();

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}
		
	}




}
