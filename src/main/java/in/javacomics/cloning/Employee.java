package in.javacomics.cloning;

/**
 * Showcases deep copy with clone method
 * @author akhsingh2
 *
 */
public class Employee implements Cloneable {
    private String id;
    private String name;
    private Designation designation;

    public Employee(String id, String name, Designation designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public Designation getDesignation() {
        return designation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.designation = (Designation) this.designation.clone();
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee("Akhilesh", "1", new Designation("Senior Associate"));
        Employee empClone = (Employee) emp.clone();
        System.out.println(emp);
        System.out.println(empClone);
        System.out.printf("Employee == Employee Clone? %b\n", emp == empClone);
        System.out.printf("Employee Designation == Employee Clone's Designation? %b\n", emp.designation == empClone.designation);
    }

}
