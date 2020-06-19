package Handlers;

import Handlers.State.StateContext;

public class RepublicanHandler extends Handler{

	private StateContext state;
	
	public RepublicanHandler(Handler handler) {
		super(handler);
		this.state = new StateContext();
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "republican") {
			//handle
			
			//handle state
		}
		else {
			super.handle(type);
		}		
	}	
}
