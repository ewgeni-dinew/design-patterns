package Actors;

import Contracts.Observer;

public class Spectator implements Observer{

	private String name;
	
	public Spectator(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println(this.name + "is updated");
	}

}
