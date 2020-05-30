package Actors;

public interface IUser {
	  void receive(String message);
	  void send(String message);
	  void removeFromMediator();
	  String getName();
}
