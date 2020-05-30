import Factory.IFactory;
import Factory.UserFactory;
import Mediator.IMediator;
import Mediator.Mediator;

public class Launcher {

	private IMediator mediator;
	private IFactory factory;
	
	public Launcher() {
		this.mediator = new Mediator();
		this.factory = new UserFactory();
	}
	
	
	public static void main(String[] args) {
		
		while(true) {
		}
	}

}
