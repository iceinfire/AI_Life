package net.iCEiNFiRE.AI_Life.utils;

import java.util.Random;

public class Rand{
	
	public static Random rand = new Random();

	/**
	 * Get a random int color parameter, r, g or b. (0 to 255)
	 */
	public static int getRandColor() {
		int i = rand.nextInt(255);
		return i;
	}
	
	/**
	 * get a random int position/number up to the number in "size".
	 * @param size
	 * @return
	 */
	public static int getRandPos(int size) {
		int i = rand.nextInt(size);
		return i;
	}
	
	/**
	 * Get a random direction out of the 8 directions:<p>
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
