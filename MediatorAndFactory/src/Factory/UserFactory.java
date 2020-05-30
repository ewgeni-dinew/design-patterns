package Factory;

import Actors.Bot;
import Actors.IUser;
import Actors.User;
import Mediator.IMediator;

public class UserFactory implements IFactory {

	public UserFactory() {
		
	}
	
	@Override
	public IUser createParticipant(String type, String name, IMediator mediator) throws Exception {
		if(type.toLowerCase().equals("user")){
	         return new User(name, mediator);
	         
	      } 
	      else if(type.toLowerCase().equals("bot")){
	         return new Bot(name, mediator);
	         
	      }     
	      else {
	    	  throw new Exception();
	      }
	}

}
