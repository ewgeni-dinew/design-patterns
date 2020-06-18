package Handlers;

public class ForeignHandler extends Handler {

	public ForeignHandler(Handler handler) {
		super(handler);
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "foreign") {
			//handle
		}
		else {
			super.handle(type);
		}	
	}

}
