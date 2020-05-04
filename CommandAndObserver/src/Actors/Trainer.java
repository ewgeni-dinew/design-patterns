package Actors;

import Commands.BaseCommand;

public class Trainer {

	private String name; 
	private Trainee trainee;
	
	public Trainer(String name) {
		this.name = name;
	}
	
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	
	public void tellCommand(BaseCommand command) {
		System.out.println(this.name + " has told the trainee to execute the command: " + command.getName());
		
		trainee.executeCommand(command);
	}
}
