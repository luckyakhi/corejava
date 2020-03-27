package in.javacomics.cloning;

public class Designation implements Cloneable{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Designation(String value) {
		super();
		this.value = value;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Designation [value=" + value + "]";
	}
	
	
	
}
