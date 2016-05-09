import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gworld {
	public static void main(String[] args){
		World world = new World();
		world.show();
		Flower flower = new Flower();
		/**
		Bug bug = new Bug();
		Location location = new Location(6,6);
		world.add(location ,bug);
		Bug bug2 = new Bug();
		Location location2 = new Location(4,4);
		world.add(location2, bug2);
		bug2.setColor(Color.MAGENTA);
		bug2.turn();
		Flower flower = new Flower();
		Flower flower2 = new Flower();
		Location flowerLocation = new Location(4,3);
		Location flowerLocation2 = new Location(4,5);
		world.add(flowerLocation, flower);
		world.add(flowerLocation2, flower2);
		**/
		
		/**for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i%2 == 0){
					Flower flower2 = new Flower();
					flower2.setColor(Color.RED);
					world.add(new Location(i,j), flower2 );
				}
				else{
					Flower flower2 = new Flower();
					flower2.setColor(Color.BLUE);
					world.add(new Location(i,j), flower2 );
				}
				
			}	
		}**/
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i==j){
					world.add(new Location(i,j), flower);
				}
				if(i+j == 10-1){
					world.add(new Location(i,j), flower);
				}
			}
			
		}
		
	}

}
