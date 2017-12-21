package in.javacomics.polymorphism;
public class StaticBindingDemo {

	public static void main(String[] args) {
		Employee e = new Manager();
		System.out.println(e.salary);
		System.out.println(e.getSalary());
	}

}