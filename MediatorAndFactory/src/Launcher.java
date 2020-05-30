import Actors.IUser;
import Mediator.IMediator;
import Mediator.Mediator;

public class Launcher {
		
	public static void main(String[] args) throws Exception {
		
		System.out.println("Started application");
		
		IMediator mediator = new Mediator();
				
		try {
			IUser ivan = mediator.addUser("User", "Ivan");
			IUser georgi = mediator.addUser("User", "Georgi");
			IUser peter = mediator.addUser("User", "Peter");		
		
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
