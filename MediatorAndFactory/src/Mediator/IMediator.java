package Mediator;

import Actors.IUser;

public interface IMediator {
	IUser addUser(String type, String name) throws Exception;
	void removeUser(IUser user);
	void sendMessage(String message, IUser user) throws Exception;
}
