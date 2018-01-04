package battleship;

public class ShipSection {
	private int x, y; //coordinates
	private boolean hit; //hit square or not
	
	public ShipSection(int x, int y){
		this.hit = false;
		this.x = x;
		this.y= y;
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
