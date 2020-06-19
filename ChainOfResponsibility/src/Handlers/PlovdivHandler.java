package Handlers;

import Handlers.State.StateContext;

public class PlovdivHandler extends Handler {
	
	private StateContext state;
	
	public PlovdivHandler(Handler handler) {
		super(handler);
		this.state = new StateContext();
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "plovdiv") {
			//handle
			
			//change state
		}
		else {
			super.handle(type);
		}	
	}

}
