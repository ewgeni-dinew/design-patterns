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
	public void removeFromMediator() {
		this.mediator = null;
	}
	
	@Override
	public void receive(String message) throws Exception {
		
		Thread.sleep(1000);
	    System.out.println("--- " + this.name + " received: " + message);	
	}

	@Override
	public void send(String message) throws Exception {
		if(this.mediator != null) {
			System.out.println(this.name + " sent: " + message);		

			Thread.sleep(1500);
			
		    this.mediator.sendMessage(message, this);			
		}	    
	}

	@Override
	public String getName() {
		return this.name;
	}
}
