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
	public void receive(String message) {
		try {
			Thread.sleep(1000);
		    System.out.println("--- " + this.name + " received: " + message);		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void send(String message) {
		if(this.mediator != null) {
			System.out.println(this.name + " sent: " + message);		
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    this.mediator.sendMessage(message, this);			
		}	    
	}

	@Override
	public String getName() {
		return this.name;
	}
}
