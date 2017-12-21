package in.javacomics.designpatterns.creational;

public class FirstNameFirstNamer extends Namer{

	@Override
	public String getame(String firstName, String lastName) {
		return firstName+","+lastName;
	}


}
