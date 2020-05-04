package Actors;

import java.util.ArrayList;

import Commands.BaseCommand;
import Contracts.Observable;
import Contracts.Observer;

public class Trainee implements Observable{
	
	private boolean isLayingDown;
	private boolean isChanged;
	
	private String name;
	ArrayList<Observer> observers; //this is the collection of all the Spectators
	
	public Trainee(String name) {
		this.isLayingDown = false;
		this.isChanged = false;
		this.name = name;
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		
		this.observers.add(observer);		
	}

	@Override
	public void clearChanged() {
		
		this.isChanged = false;
	}

	@Override
	public void deleteObserver(Observer observer) {
		
		this.observers.remove(observer);	
	}

	@Override
	public boolean hasChanged() {
	
		return this.isChanged;
	}

	@Override
	public void notifyObservers() {
		
		for (Observer observer : this.observers) 
		{ 
		    observer.update();
		}
	}

	@Override
	public void setChanged() {
		
		this.isChanged = true;	
		
		this.notifyObservers();
	}

	public void executeCommand(BaseCommand command) {
		
		String commandName = command.getClass().getSimpleName();
		
		if(commandName.equals("LayDownCommand") && this.isLayingDown){			
			System.out.println("Already executed the given command!");
			
			return;
		}
		else if(commandName.equals("StandUpCommand") && !this.isLayingDown)
		{
			System.out.println("Already executed the given command!");
			
			return;
		}
		
		this.isLayingDown = !this.isLayingDown;
		
		System.out.println(this.name + " is executing command: " + command.getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setChanged();
		
		this.clearChanged();
	}
}
