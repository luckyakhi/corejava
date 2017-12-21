package in.javacomics.superdemo;

public class Rectangle {
	private float length;
	private float width;
	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}
	public float calcualteArea(){
		return length*width;
	}

}
