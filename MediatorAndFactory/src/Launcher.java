import Actors.IUser;
import Factory.IFactory;
import Factory.UserFactory;
import Mediator.IMediator;
import Mediator.Mediator;

public class Launcher {
		
	public static void main(String[] args) throws Exception {
		
		System.out.println("Started application");
		
		IMediator mediator = new Mediator();
		IFactory factory = new UserFactory();
				
		try {
			IUser ivan = factory.createParticipant("User", "Ivan", mediator);
			IUser georgi = factory.createParticipant("User", "Georgi", mediator);
			IUser peter = factory.createParticipant("User", "Peter", mediator);
		
			IUser[] array = new IUser[]{ivan, peter, georgi};
			mediator.addMultipleUsers(array);
		
			ivan.send("Hi.");
			ivan.send("Do you hear me?");
			georgi.send("Hi, Ivan. Yes we do.");
			peter.send("Hi all. addBot");
			peter.send("This is not ok");		
			
			ivan.send("cat."); //Ivan is removed from chat
			
			ivan.send("Sorry."); //Ivan tries to send message but cannot
			
			peter.send("Test."); //Only Georgi receives the message
			
		}
		catch(Exception ex) {
			System.out.println("An error was encountered: " + ex.getMessage());
		}			
	}
}
