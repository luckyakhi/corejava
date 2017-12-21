package in.javacomics.designpatterns.behavioural;

import java.util.ArrayList;
import java.util.List;

public class CounterSubject implements Subject{

	private int state;
	private List<Observer> observers;
	
	
	
	public CounterSubject() {
		super();
		observers= new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void deregisterObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
		
	}
	
	public void increment(){
		state++;
		notifyObservers();
	}

	public int getState() {
		return state;
	}
	
	

}
