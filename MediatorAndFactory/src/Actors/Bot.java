package Actors;

import Mediator.IMediator;

public class Bot implements IUser {

	private IMediator mediator;
	private String name;
	
	public Bot(String name, IMediator mediator) {
		this.mediator = mediator;
		this.name = name;
	}
	
	@Override
	public void receive(String message) {
		//bot receives the message but no Console input		
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
	public void removeFromMediator() {
		this.mediator = null;		
	}

	@Override
	public String getName() {
		return this.name;
	}
}
