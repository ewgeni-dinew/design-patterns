package Handlers;

import Handlers.Contracts.IObservable;
import Handlers.Contracts.IObserver;
import Handlers.State.RestState;
import Handlers.State.StateContext;
import Handlers.State.WorkState;

public class ForeignHandler extends Handler implements IObservable {

	private StateContext state;
	private IObserver observer;
	
	public ForeignHandler(Handler handler) {
		super(handler);
		this.state = new StateContext();		
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "foreign") {
			
			this.state.setState(new WorkState());
			
			notifyObservers();
			
			this.state.setState(new RestState());
		}
		else {
			super.handle(type);
		}	
	}

	@Override
	public void addObserver(IObserver observer) {
		this.observer = observer;	
	}

	@Override
	public void notifyObservers() {
		this.observer.update();		
	}
}
