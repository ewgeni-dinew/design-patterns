package Handlers;

public class RepublicanHandler extends Handler{

	public RepublicanHandler(Handler handler) {
		super(handler);
	}

	@Override
	public void handle(String type) {
		if(type.toLowerCase() == "republican") {
			//handle
		}
		else {
			super.handle(type);
		}		
	}	
}
