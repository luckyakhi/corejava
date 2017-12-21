package in.javacomics.designpatterns.behavioural;

public class ObserverLogger implements Observer {

	@Override
	public void update() {
		System.out.println("Updated");
		
	}

}
