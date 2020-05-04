package Actors;

import Contracts.Observer;

public class Spectator implements Observer{

	private String name;
	
	public Spectator(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println(this.name + " has executed the same command");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
