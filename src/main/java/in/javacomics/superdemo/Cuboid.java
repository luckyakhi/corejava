package in.javacomics.superdemo;

public class Cuboid extends Rectangle{
	private float height;

	public Cuboid(float height,float length, float breadth) {
		super(length,breadth);
		this.height = height;
	}
	
	public float volume(){
		return this.height*super.calcualteArea();
	}
}
