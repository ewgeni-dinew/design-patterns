import java.util.ArrayList;

import Actors.IUser;
import Actors.User;
import Factory.IFactory;
import Factory.UserFactory;
import Mediator.IMediator;
import Mediator.Mediator;

public class Launcher {

	private static IMediator mediator;
	private static IFactory factory;
	
	public Launcher() {
		mediator = new Mediator();
		factory = new UserFactory();
	}
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("Started application");
				
		try {
			IUser ivan = factory.createParticipant("User", "Ivan", mediator);
			IUser georgi = factory.createParticipant("User", "Georgi", mediator);
			IUser peter = factory.createParticipant("User", "Peter", mediator);
		}
		catch(Exception ex) {
			System.out.println("An error was encountered: "+ex.getMessage());
		}

		IUser[] array = new IUser[]{ivan, peter, georgi};
		mediator.addMultipleUsers(array);

		
	}

}
