package Chain;

import Handlers.Handler;
import Requests.RequestType;

public class Chain {
	Handler chain;
	
	public Chain(Handler start) {
		this.chain = start;
	}
	
	public void process(String message, RequestType requestType) { 
		
		String type = requestType.toString();
		
		System.out.println(type);
		
	    this.chain.handle(type);
	} 
}
