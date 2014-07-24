package net.iCEiNFiRE.AI_Life;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class Graph {
	
	public static JFrame frame;
	public static Graphics g;
	public static BufferStrategy bs;
	
	public static int mouseX, mouseY;
	public static boolean mousePress = false;
	
	public static int width = 800;
	public static int height = 600;
	
	public static void init() {
		
		frame = new JFrame("Life is Amazing!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.createBufferStrategy(2);
		
		frame.addMouseMotionListener(new MouseMotionListener() {
			 public void mouseMoved(MouseEvent e) {
				mouseX = e.getX();
			 	mouseY = e.getY();
			 }
			 public void mouseDragged(MouseEvent e) {
			 	mouseX = e.getX();
			 	mouseY = e.getY();
			 }
		});
		frame.addMouseListener(new MouseListener() {
			
			public void mousePressed(MouseEvent e) {	
				mousePress = true;
			}
			
			public void mouseReleased(MouseEvent e) {
				mousePress = false;
			}
			
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		
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
