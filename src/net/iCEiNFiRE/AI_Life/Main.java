package net.iCEiNFiRE.AI_Life;

public class Main {
	public static boolean running = true;
	public static GameWorld world = new GameWorld();
	public static void main(String[] args) {
		Graph.init();
		long lastTime = System.nanoTime(), timer = System.currentTimeMillis();
		int frames = 0, updates = 0;
		double delta = 0, ns = 1000000000 / 60;
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				world.update();
				updates++;
				delta--;
			}
			Graph.pullPixels();
			world.render();
			Graph.pushPixels();
			frames++;
			if(System.currentTimeMillis() - timer > 1000) {
				timer+=1000;
				System.out.println(updates + "ups, " + frames + " fps");
				updates=0;
				frames=0;
			}
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				crashExit(e);
			}
		}
	}
	public static void crashExit(Exception e) {
		e.printStackTrace();
		System.exit(1);
	}
	
}
