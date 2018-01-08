package battleship;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ShipSection {
	private int x, y; //coordinates
	private boolean hit; //hit square or not
	
	public static BufferedImage image;
	
	public ShipSection(int x, int y){
		
		if(image == null){
			try {
				image = ImageIO.read(new File("images/bs.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.hit = false;
		this.x = x;
		this.y= y;
	}
	
	public void drawShip(Graphics2D g){
		g.drawImage(image, x*10, y*10, 10, 10, null);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void hit(){
		hit = true;
	}
	
	public boolean hasBeenHit(){
		return hit;
	}
	
}
