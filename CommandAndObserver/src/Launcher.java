import java.util.Scanner;

import Actors.Spectator;
import Actors.Trainee;
import Actors.Trainer;
import Commands.LayDownCommand;
import Commands.StandUpCommand;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("Started application");
		System.out.println("Use commands: 'lay' or 'stand'");
		
		Trainee trainee = new Trainee("Trainee_1");
        Trainer trainer = new Trainer("Trainer_1");
        
        LayDownCommand layDownCommand = new LayDownCommand();
        StandUpCommand standUpCommand = new StandUpCommand();


        trainee.addObserver(new Spectator("Spectator_1"));
        trainee.addObserver(new Spectator("Spectator_2"));
        trainee.addObserver(new Spectator("Spectator_3"));
        
        trainer.setTrainee(trainee);

        while (true) { 

        	Scanner scanner = new Scanner(System.in);
        	
        	String input = scanner.nextLine();

        	if(input.equals("lay")) {
        		trainer.tellCommand(layDownCommand);
        	}
        	else if(input.equals("stand")) {
        		trainer.tellCommand(standUpCommand);
        	}
        }
	}

}