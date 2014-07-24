package net.iCEiNFiRE.AI_Life.utils;

import java.util.Random;

public class Rand{
	
	public static Random rand = new Random();

	public static int getRandColor() {
		int i = rand.nextInt(255);
		return i;
	}
	
	public static int getRandPos(int size) {
		int i = rand.nextInt(size);
		return i;
	}
	
	/**
	 * [0][1][2]<p>
	 * [7][+][3]<p>
	 * [6][5][4]
	 * 
	 * @return
	 */
	public static int getRandDirection() {
		int i = rand.nextInt(8);
		return i;
	}
	
}
