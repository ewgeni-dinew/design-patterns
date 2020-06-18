package Handlers;

public class PlovdivHandler extends Handler {

	public PlovdivHandler(Handler handler) {
		super(handler);
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "plovdiv") {
			//handle
		}
		else {
			super.handle(type);
		}	
	}

}
