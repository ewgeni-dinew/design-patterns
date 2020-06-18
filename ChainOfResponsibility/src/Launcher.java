import Chain.Chain;
import Handlers.ForeignHandler;
import Handlers.PlovdivHandler;
import Handlers.RepublicanHandler;
import Requests.RequestType;

public class Launcher {

	public static void main(String[] args) {

		ForeignHandler foreignHandler = new ForeignHandler(null);
		RepublicanHandler republicanHandler = new RepublicanHandler(foreignHandler);
		PlovdivHandler plovdivHandler = new PlovdivHandler(republicanHandler);

		Chain chain = new Chain(plovdivHandler);
		
		chain.process("123", RequestType.Foreign);
		chain.process("123", RequestType.Republican);
		chain.process("123", RequestType.Plovdiv);

	}
}
