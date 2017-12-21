package in.javacomics.cloning;
public class CloneableEmployee implements Cloneable{
	private String name;
	private int age;
	private Designation designation;
	
	
	private CloneableEmployee(String name, int age, Designation designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	public static void main(String[] args) {
		
		try {
			CloneableEmployee emp = new CloneableEmployee("Akhilesh",29,new Designation("Senior Associate"));
			CloneableEmployee empClone =(CloneableEmployee) emp.clone();
			System.out.println(emp);
			System.out.println(empClone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return "CloneableEmployee [name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}
	
}