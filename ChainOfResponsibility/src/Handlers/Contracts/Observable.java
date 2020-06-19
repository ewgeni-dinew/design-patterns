package Handlers.Contracts;

public interface Observable {
	void addObserver(Observer observer);
	
	void clearChanged();
	
	void deleteObserver(Observer observer);
	
	boolean hasChanged();
	
	void notifyObservers();
	
	void setChanged();
}
