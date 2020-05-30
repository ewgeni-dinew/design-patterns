package Factory;

import Actors.IUser;
import Mediator.IMediator;

public interface IFactory {
	public IUser createParticipant(String type, String name, IMediator mediator) throws Exception;
}
