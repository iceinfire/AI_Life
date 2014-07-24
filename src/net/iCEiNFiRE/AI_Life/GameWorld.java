package net.iCEiNFiRE.AI_Life;

import java.util.ArrayList;
import java.util.Random;

public class GameWorld {
	ArrayList<Person> peoples = new ArrayList<Person>();
	public GameWorld() {
		Random r = new Random();
		for(int i = 0; i < 12; i++) peoples.add(new Person(20+(r.nextInt(12)*10), 40+(r.nextInt(12)*10)));
	}
	public void update() {
		for(Person person : peoples) person.update();
	}
	public void render() {
		for(Person person : peoples) person.render();
	}
}
