package Mediator;

import java.util.ArrayList;

import Actors.IUser;
import Factory.IFactory;
import Factory.UserFactory;

public class Mediator implements IMediator{

	private ArrayList<IUser> users;
	private boolean isChatBotActive;
	private IFactory factory;
	
	public Mediator() {
		this.users = new ArrayList<IUser>();
		this.isChatBotActive = false;
		this.factory = new UserFactory();
	}
	
	@Override
	public IUser addUser(String type, String name) throws Exception {
		
		IUser user = this.factory.createParticipant(type, name, this);
		
		this.users.add(user);	
		
		return user;
	}
		

	@Override
	public void removeUser(IUser user) {
		this.users.remove(user);	
		user.removeFromMediator();
	}

	@Override
	public void sendMessage(String message, IUser sender) throws Exception {
		
		//check message
		if(message.contains("addBot")){
			
			//add the bot in the chat
			this.addUser("bot", "Bot");
			this.isChatBotActive = true;
			
			System.out.println("***Chat Bot has been added.***");
		}
		
		if(message.contains("cat") && this.isChatBotActive) {			
			this.removeUser(sender);
			System.out.println("!!! " + sender.getName() + " has been removed from chat.!!!");
		}
		else {
			for(IUser user: this.users) {
				   if(user != sender) {			   
				       user.receive(message);
				   }
				}		
		}					
	}
}
