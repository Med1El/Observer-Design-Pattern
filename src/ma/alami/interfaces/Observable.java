package ma.alami.interfaces;

public interface Observable {
	
	void subscribe(Observer o);
	void unsubscribe(Observer o);
	void notifyObserversPush(String state);
	void notifyObserversPop();
	String getState(Observer caller);

}
