package in.javacomics.strings;

public class StringPoolDemo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1=="abc");//True
		System.out.println(s1==s2);//False
		
	}

}
