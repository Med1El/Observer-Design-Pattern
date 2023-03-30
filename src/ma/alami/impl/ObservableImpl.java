package ma.alami.impl;

import java.util.HashSet;
import java.util.Set;

import ma.alami.interfaces.Observable;
import ma.alami.interfaces.Observer;

public class ObservableImpl implements Observable {

	private String state;
	private Set<Observer> observers = new HashSet<Observer>();

	@Override
	public void subscribe(Observer o) {
		observers.add(o);
		o.setObservable(this);
	}

	@Override
	public void unsubscribe(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObserversPop() {
		for (Observer o : observers) {
			o.notifye();
		}

	}

	@Override
	public void notifyObserversPush(String state) {
		this.state = state;
		for (Observer o : observers) {
			o.update(this.state);
		}

	}


	@Override
	public String getState(Observer caller) { // always provide 'this' to this method
		System.out.println("getState called by " + caller);
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
