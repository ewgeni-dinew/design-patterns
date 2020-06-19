package Handlers;

import Handlers.State.StateContext;

public class ForeignHandler extends Handler {

	private StateContext state;
	
	public ForeignHandler(Handler handler) {
		super(handler);
		this.state = new StateContext();		
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "foreign") {
			//handle
			
			//handle state
		}
		else {
			super.handle(type);
		}	
	}

}
