package Handlers.State;

public class StateContext {
	
	private IHandlerState currentState;
	
	public StateContext() {
		this.currentState = new RestState();
	}
	
	public void setState(IHandlerState state)  
    { 
        this.currentState = state; 
    } 
	
	public void alert()  
    { 
        this.currentState.handle(); 
    } 
}
