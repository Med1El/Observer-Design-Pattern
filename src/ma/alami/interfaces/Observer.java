package ma.alami.interfaces;

public interface Observer {
	
	void setObservable(Observable o);
	void notifye(); //notify is a method o the Object class
	void update(String state);

}
