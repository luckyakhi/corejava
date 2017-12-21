package in.javacomics.designpatterns.creational;

public class LastNameFirstNamer extends Namer{

	@Override
	public String getame(String firstName, String lastName) {
		return lastName+","+firstName;
	}


}
