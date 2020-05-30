package Mediator;

import java.util.ArrayList;

import Actors.Bot;
import Actors.IUser;

public class Mediator implements IMediator{

	private ArrayList<IUser> users;
	private boolean isChatBotActive;
	
	public Mediator() {
		this.users = new ArrayList<IUser>();
		this.isChatBotActive = false;
	}
	
	@Override
	public void addUser(IUser user) {
		this.users.add(user);		
	}

	@Override
	public void removeUser(IUser user) {
		this.users.remove(user);	
		user.removeFromMediator();
	}

	@Override
	public void sendMessage(String message, IUser sender) {
		
		//check message
		if(message.contains("addBot")){
			IUser bot = new Bot("Bot", this);
			
			//add the bot in the chat
			this.addUser(bot);
			this.isChatBotActive = true;
			
			System.out.println("***Chat Bot has been added.***");
		}
		
		if(message.contains("cat") && this.isChatBotActive) {			
			this.removeUser(sender);
			System.out.println("Sender has been removed from chat.");
		}
		else {
			for(IUser user: this.users) {
				   if(user != sender) {			   
				       user.receive(message);
				   }
				}		
		}					
	}

	@Override
	public void addMultipleUsers(IUser[] users) {
		for(IUser user: users) {		
			this.users.add(user);		
		}
	}
}
