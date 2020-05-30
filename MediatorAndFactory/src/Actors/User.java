package Actors;

import Mediator.IMediator;

public class User implements IUser {
	
	private IMediator mediator;
	private String name;
	
	public User(String name, IMediator mediator) {
		this.mediator = mediator;
		this.name = name;
	}
	
	@Override
	public void receive(String message) {
	    System.out.println("--- " + this.name + " received: " + message);		
	}

	@Override
	public void send(String message) {
	    System.out.println(this.name + " sent: " + message);		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    this.mediator.sendMessage(message, this);		
	}

}
