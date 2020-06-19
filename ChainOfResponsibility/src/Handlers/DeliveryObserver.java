package Handlers;

import Handlers.Contracts.IObserver;

public class DeliveryObserver implements IObserver {

	@Override
	public void update() {
		System.out.println("Delivery man has taken the package.");
	}

}
