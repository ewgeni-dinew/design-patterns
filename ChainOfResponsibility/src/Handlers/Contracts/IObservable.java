package Handlers.Contracts;

public interface IObservable {
	void addObserver(IObserver observer);

	void notifyObservers();	
}
