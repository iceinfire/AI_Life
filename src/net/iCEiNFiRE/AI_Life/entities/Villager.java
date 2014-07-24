package net.iCEiNFiRE.AI_Life.entities;

import java.awt.Color;
import java.awt.Graphics;

import net.iCEiNFiRE.AI_Life.utils.Rand;

public class Villager {

	int posX;
	int posY;
	
	Color color;
	
	public int direction;
	int speed = 3;
	
	public Villager(int x, int y) {
		this.posX = x;
		this.posY = y;
		
		color = new Color(Rand.getRandColor(), Rand.getRandColor(), Rand.getRandColor());
		
		direction = Rand.getRandDirection();
		
	}
			
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(posX, posY, 10, 10);
	}
	
	public void move(int direc) {
		
		switch (direc) {
		case 0: 
			posX = posX - speed;
			posY = posY - speed;
			break;
		case 1:
			posY = posY - speed;
			break;
		case 2:
			posX = posX + speed;
			posY = posY - speed;
			break;
		case 3:
			posX = posX + speed;
			break;
		case 4:
			posX = posX + speed;
			posY = posY + speed;
			break;
		case 5:
			posY = posY + speed;
			break;
		case 6:
			posX = posX - speed;
			posY = posY + speed;
			break;
		case 7:
			posX = posX - speed;
			break;
		}
	}

}
