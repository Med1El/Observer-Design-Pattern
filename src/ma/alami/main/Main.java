package ma.alami.main;

import java.util.Scanner;

import ma.alami.impl.ObservableImpl;
import ma.alami.impl.ObserverImpl;

public class Main {
	
	public static void main(String[] args) {
		
		
		ObservableImpl subject = new ObservableImpl();
		ObserverImpl observer1 = new ObserverImpl("first");
		ObserverImpl observer2 = new ObserverImpl("second");
		ObserverImpl observer3 = new ObserverImpl("third");
		ObserverImpl observer4 = new ObserverImpl("fourth");
		subject.subscribe(observer1);
		subject.subscribe(observer2);
		subject.subscribe(observer3);
		subject.subscribe(observer4);
		try (Scanner scanner = new Scanner(System.in)) {
			
			while(true) {
				
				String input = scanner.nextLine();
				
				if(input.equalsIgnoreCase("exit")) break;
				
				//using pop method
				subject.setState(input);
				subject.notifyObserversPop();
				
				//using push method
				//ubject.notifyObserversPush(input);
				
				System.out.println();
			}
		}

		
	}

}
