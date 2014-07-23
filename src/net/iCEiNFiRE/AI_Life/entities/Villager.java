package net.iCEiNFiRE.AI_Life.entities;

import java.awt.Color;
import java.awt.Graphics;

public class Villager {
	
	public static void draw(Graphics g, int x, int y) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, 10, 10);
	}

}
