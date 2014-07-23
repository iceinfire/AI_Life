package net.iCEiNFiRE.AI_Life;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Graph {
	public static JFrame frame;
	public static Graphics g;
	public static BufferStrategy bs;
	public static void init() {
		frame = new JFrame("Life is Amazing!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.createBufferStrategy(2);
	}
	public static void pullPixels() {
		bs = frame.getBufferStrategy();
		g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
		g.setColor(Color.WHITE);
	}
	public static void pushPixels() {
		g.dispose();
		bs.show();
		frame.update(g);
	}
	
}
