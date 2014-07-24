package net.iCEiNFiRE.AI_Life;

import java.util.Random;

public class Person {
	int x, y, next_x, next_y, timer;
	public Person(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Random random = new Random();
	public void update() {
		timer++;
		int x = 0, y = 0;
		if(timer==30) {
			x=10*(random.nextInt(3)-1);
			y=10*(random.nextInt(3)-1);
//			x=-1;
//			y=-1;
			if(next_x+(x*10) > -10 && next_x+(x*10) < Graph.frame.getWidth()) next_x+=x;
			if(next_y+(y*10) > -10 &&  next_y+(y*10) < Graph.frame.getHeight()) next_y+=y;
			timer=0;
		}
		if(next_x*10 > this.x) this.x+=3;
		else this.x-=3;
		if(next_y*10 > this.y) this.y+=3;
		else this.y-=3;
//		this.x = next_x*10;
//		this.y = next_y*10;
	}
	public void render() {
		Graph.drawPlayer(x, y);
	}
}
