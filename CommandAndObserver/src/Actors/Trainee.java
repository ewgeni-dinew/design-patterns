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
		
		if(command.getClass().getName().toString().equals("LayDownCommand") && this.hasChanged()) {
			this.isLayingDown = true;
		}
		else if(command.getClass().getName().toString().equals("StandUpCommand")) {
			this.isLayingDown = false;
		}
		
		System.out.println(this.name + "is executing command: " + command.getName());
		
		this.setChanged();
		
		this.clearChanged();
	}
}
