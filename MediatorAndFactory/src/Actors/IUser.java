package Actors;

public interface IUser {
	  void receive(String message) throws Exception;
	  void send(String message) throws Exception;
	  void removeFromMediator();
	  String getName();
}
