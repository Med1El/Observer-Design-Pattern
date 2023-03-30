package ma.alami.impl;

import ma.alami.interfaces.Observable;
import ma.alami.interfaces.Observer;

public class ObserverImpl implements Observer {
	
	public ObserverImpl(String name) {
		this.name = name;
	}
	private String name;
	private String state;
	private Observable observable;
	
	@Override
	public void setObservable(Observable o) {
		this.observable = o;
		
	}
	

	@Override
	public void notifye() {
		state = observable.getState(this);
		System.out.println(" POP | "+ name + " observer updated with state = " + " " + state);
	}

	@Override
	public void update(String state) {
		this.state = state;
		System.out.println("PUSH | " + name + " observer updated with state = " + " " + state);

		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}


	

}
