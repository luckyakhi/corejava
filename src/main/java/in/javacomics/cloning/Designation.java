package in.javacomics.cloning;

public class Designation {
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
	public String toString() {
		return "Designation [value=" + value + "]";
	}
	
	
	
}
