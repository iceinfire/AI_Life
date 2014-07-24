package net.iCEiNFiRE.AI_Life.utils;

import java.awt.Color;
import java.awt.Rectangle;

import net.iCEiNFiRE.AI_Life.Graph;

public class Button {
	
	/**
	 * Rectangle shape for mouse inbounds checking. [via rect.contains(point)]
	 */
	public Rectangle rect;
	
	Color color;
	
	int posX, posY, width, height;

	public Button(int x, int y, int width, int height, Color color){
		this.posX = x;
		this.posY = y;
		this.width = width;
		this.height = height;
		this.color = color;
		
		rect = new Rectangle(posX, posY, this.width, this.height);
	}
	
	public void draw() {
		Graph.g.setColor(color);
		Graph.g.fillRect(posX, posY, width, height);
	}
	
}
