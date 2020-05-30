package Mediator;

import java.util.ArrayList;

import Actors.IUser;

public class Mediator implements IMediator{

	private ArrayList<IUser> users;
	
	public Mediator() {
		this.users = new ArrayList<IUser>();
	}
	
	@Override
	public void addUser(IUser user) {
		this.users.add(user);		
	}

	@Override
	public void removeUser(IUser user) {
		this.users.remove(user);		
	}

	@Override
	public void sendMessage(String message, IUser sender) {
		for(IUser user: this.users) {
		      if(user != sender) {
		        user.receive(message);
		      }
		    }		
	}
}
