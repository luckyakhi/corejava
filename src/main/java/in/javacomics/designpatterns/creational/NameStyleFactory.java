package in.javacomics.designpatterns.creational;

public class NameStyleFactory {
	public Namer getNamer(NamerStyle style){
		switch(style){
			case FIRST_NAME_FIRST: return new FirstNameFirstNamer();
			case LAST_NAME_FIRST: return new LastNameFirstNamer();
			default: return null;
		}
	}
}
