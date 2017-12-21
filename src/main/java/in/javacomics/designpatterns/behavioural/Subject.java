package in.javacomics.designpatterns.behavioural;

public interface Subject {
	public void deregisterObserver(Observer o);
	public void notifyObservers();
	void registerObserver(Observer o);
}
