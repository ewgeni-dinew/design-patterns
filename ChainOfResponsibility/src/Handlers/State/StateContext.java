package Handlers.State;

public class StateContext {
	
	private IHandlerState currentState;
	
	public StateContext() {
		this.currentState = new RestState();
	}
	
	public void setState(IHandlerState state)  
    { 
		System.out.println("Desk State changed to " + state.getClass().getName());
        this.currentState = state; 
    } 
	
	public void alert()  
    { 
        this.currentState.handle(); 
    } 
}
