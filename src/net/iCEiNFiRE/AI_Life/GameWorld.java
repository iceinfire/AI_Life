package net.iCEiNFiRE.AI_Life;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import net.iCEiNFiRE.AI_Life.entities.Villager;
import net.iCEiNFiRE.AI_Life.utils.Button;
import net.iCEiNFiRE.AI_Life.utils.Rand;

public class GameWorld {
	
	/**
	 * List of all the generated villagers.
	 */
	ArrayList<Villager> villagers = new ArrayList<Villager>();
	
	/**
	 * World Border
	 */
	Rectangle border = new Rectangle(Graph.width-60, Graph.height-60);

	Button close;
	
	/**
	 * create the world
	 */
	public void init() {
		
		border.setLocation(30, 30);
		
		//create close button
		close = new Button(Graph.width-40, 20, 20, 20, Color.RED);
		
		//Create villagers
		for (int i = 0; i < 20; i++) {
			Villager v = new Villager(Rand.getRandPos(border.width), Rand.getRandPos(border.height));
			villagers.add(v);
		}
	}
	
	/**
	 * update the world
	 */
	public void update() {
		//villager update (move)
		for (Villager villager : villagers) {
			if (border.contains(villager.posX, villager.posY)) {
				villager.move(villager.direction);
			}
		}
		
		//button update
		if (close.rect.contains(Graph.mouseX, Graph.mouseY) && Graph.mousePress){
			Main.running = false;
		}
		
	}
	
	/**
	 * render the world
	 */
	public void render() {
		//temp world boderder draw
		Graph.g.drawRect(border.x, border.y, border.width, border.height);
		
		//villager draw
		for (Villager villager : villagers) {
			villager.draw(Graph.g);
		}
		
		//button draw
		close.draw();
	}
}
