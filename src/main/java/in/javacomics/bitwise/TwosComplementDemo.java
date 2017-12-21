package in.javacomics.bitwise;

public class TwosComplementDemo {

	public static void main(String[] args) {
		byte postiveValue10 = 0b0001010;
		System.out.println("Corresponding binary representation:"+postiveValue10);
		byte negativeValue10 = 	~0b0001010+0b1;
		System.out.println("Corresponding binary representation:"+negativeValue10);
		
	}

}
