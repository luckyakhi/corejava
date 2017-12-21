package in.javacomics.designpatterns.structural.flyweight;

public class Square implements Shape{
	private String color;
	private int size;
	
	public Square(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}

	@Override
	public void draw(String location) {
		System.out.printf("Drawing square of color %s and size %d at location %s \n",color,size,location);
		
	}
	
	
	
}
