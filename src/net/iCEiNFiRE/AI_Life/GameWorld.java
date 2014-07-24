package net.iCEiNFiRE.AI_Life;

import java.util.ArrayList;

import net.iCEiNFiRE.AI_Life.entities.Villager;
import net.iCEiNFiRE.AI_Life.utils.Rand;

public class GameWorld {
	
	ArrayList<Villager> villagers = new ArrayList<Villager>();
	
	public void init() {
		for (int i = 0; i < 20; i++) {
			Villager v = new Villager(Rand.getRandPos(Graph.width), Rand.getRandPos(Graph.height));
			villagers.add(v);
		}
	}
	
	public void update() {
		for (int i = 0; i < villagers.size(); i++) {
			villagers.get(i).move(villagers.get(i).direction);
		}
		
	}
	public void render() {
		for (int i = 0; i < villagers.size(); i++) {
			villagers.get(i).draw(Graph.g);
		}
	}
}
