package Handlers;

public abstract class Handler implements IHandler{
	
	private Handler handler; 
	  
    public Handler(Handler handler){ 
        this.handler = handler; 
    }; 
      
    public void handle(String type){ 
        if(this.handler != null) 
            this.handler.handle(type); 
    };  
}
