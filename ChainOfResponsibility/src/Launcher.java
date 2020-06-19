import Chain.Chain;
import Handlers.DeliveryObserver;
import Handlers.ForeignHandler;
import Handlers.PlovdivHandler;
import Handlers.RepublicanHandler;
import Requests.RequestType;

public class Launcher {

	public static void main(String[] args) {

		DeliveryObserver observer = new DeliveryObserver();
		
		ForeignHandler foreignHandler = new ForeignHandler(null);
		RepublicanHandler republicanHandler = new RepublicanHandler(foreignHandler);
		PlovdivHandler plovdivHandler = new PlovdivHandler(republicanHandler);
		
		foreignHandler.addObserver(observer);
		republicanHandler.addObserver(observer);
		plovdivHandler.addObserver(observer);		

		Chain chain = new Chain(plovdivHandler);
		
		chain.process("123", RequestType.Foreign);
		
		System.out.println("---");
		chain.process("123", RequestType.Republican);
		System.out.println("---");

		chain.process("123", RequestType.Plovdiv);
	}
}
