package Mediator;

import Actors.IUser;

public interface IMediator {
	void addUser(IUser user);
	void removeUser(IUser user);
	void sendMessage(String message, IUser user);
}
