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
	    System.out.println(this.name + " received: " + message);		
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		
	}

}
