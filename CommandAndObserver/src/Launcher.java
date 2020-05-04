import Actors.Spectator;
import Actors.Trainee;
import Actors.Trainer;

public class Launcher {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee("Trainee_1");
        Trainer trainer = new Trainer("Trainer_1");

        trainee.addObserver(new Spectator("Spectator_1"));
        trainee.addObserver(new Spectator("Spectator_2"));
        trainee.addObserver(new Spectator("Spectator_3"));
        

        while (true) { 
        	//finish Business logic
        }
	}

}