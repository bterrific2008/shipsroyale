
import battleship.*;
import gui.*;
import board.*;

public class Driver {

	public static void main(String args[]){
		Battleship bat = new Battleship();
		BoardFrame x = new BoardFrame(bat, "Battleship");
		x.setVisible(true);
	}
	
}
