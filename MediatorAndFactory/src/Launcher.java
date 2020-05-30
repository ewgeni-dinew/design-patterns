import Actors.IUser;
import Actors.User;
import Factory.IFactory;
import Factory.UserFactory;
import Mediator.IMediator;
import Mediator.Mediator;

public class Launcher {
	/*
	private static IMediator mediator;
	private static IFactory factory;
	
	public Launcher() {
		mediator = new Mediator();
		factory = new UserFactory();
	}
	*/
	
	public static void main(String[] args) throws Exception {
		System.out.println("Started application");
		
		IMediator mediator = new Mediator();
		IFactory factory = new UserFactory();
				
		try {
			//IUser ivan = new User("Ivan", mediator);
			//IUser georgi = new User("Ivan", mediator);
			//IUser peter = new User("Ivan", mediator);

			IUser ivan = factory.createParticipant("User", "Ivan", mediator);
			IUser georgi = factory.createParticipant("User", "Georgi", mediator);
			IUser peter = factory.createParticipant("User", "Peter", mediator);
		
			IUser[] array = new IUser[]{ivan, peter, georgi};
			mediator.addMultipleUsers(array);
		
			ivan.send("Hi.");
			ivan.send("Do you hear me?");
			georgi.send("Hi, Ivan. Yes we do.");
			peter.send("Hi all.");
			peter.send("This is not ok");
		
		}
		catch(Exception ex) {
			System.out.println("An error was encountered: " + ex.getMessage());
		}			
	}
}
