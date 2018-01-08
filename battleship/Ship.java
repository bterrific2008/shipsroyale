package battleship;


public class Ship {
	private ShipSection[] sections;
	
	private final int BOARD_SIZE= 10;
	
	public enum Directions{
		HORIZONTAL, VERTICAL;
	}
	
	/*
	 * x and y are the starting coordinates
	 * dir determines which direction the ship will branch out
	 * size determines how long the ship is
	 */
	public Ship(int x, int y, Directions dir, int size){
		sections = new ShipSection[size];
		
		if(dir == Directions.HORIZONTAL){
			
			while(x+size > BOARD_SIZE){
				x--;
			}
			
			for(int i = 0; i < sections.length; i++){
				sections[i] = new ShipSection(x+i, y);
			}
		}
		
		if(dir == Directions.VERTICAL){
			
			while(y+size > BOARD_SIZE){
				y--;
			}
			
			for(int i = 0; i<sections.length; i++){
				sections[i] = new ShipSection(x, y+i);
			}
		}
	}
	
	
	
	public boolean isSunk(){
		boolean isSunk = true;
		for(int i = 0; i<sections.length; i++){
			if(!sections[i].hasBeenHit()){
				isSunk = false;
				break;
			}
		}
		return isSunk;
	}
	
	public ShipSection[] getSections(){
		return sections;
	}
	
}
