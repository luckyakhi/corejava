package in.javacomics.serialization;

import java.io.Serializable;

public class B implements Serializable{
	private A a;

	public B(A a) {
		super();
		this.a = a;
	}
	

}
