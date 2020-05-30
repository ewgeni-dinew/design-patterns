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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromMediator() {
		// TODO Auto-generated method stub
		
	}
}
