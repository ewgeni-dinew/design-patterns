package Actors;

import java.util.ArrayList;

import Contracts.Observable;
import Contracts.Observer;

public class Trainee implements Observable{
	
	private String name;
	ArrayList<Observer> observers; //this is the collection of all the Spectators
	
	public Trainee(String name) {
		this.name = name;
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		
		this.observers.add(observer);		
	}

	@Override
	public void clearChanged() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteObserver(Observer observer) {
		
		this.observers.remove(observer);	
	}

	@Override
	public boolean hasChanged() {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		
	}

	
}
