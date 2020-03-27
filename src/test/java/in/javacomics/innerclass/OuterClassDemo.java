package in.javacomics.innerclass;

public class OuterClassDemo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass("outerClassMember", "innerClassMember");
		System.out.println(" Inner class member:"+outerClass.getInnerClassMember());
		System.out.println(" Outer class member:"+outerClass.getOuterClassMember());
	}

}
