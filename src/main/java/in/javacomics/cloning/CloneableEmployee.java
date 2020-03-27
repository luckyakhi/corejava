package in.javacomics.cloning;

/**
 * This class demonstrates that Object's class clone method does not do a deep copy
 * If need to create a deep copy we need to override the clone method see Employee.java
 * Also clone in object class is protected so if cloning from outside class constructs then override and make it public
 */
public class CloneableEmployee implements Cloneable {
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
            CloneableEmployee emp = new CloneableEmployee("Akhilesh", 29, new Designation("Senior Associate"));
            CloneableEmployee empClone = (CloneableEmployee) emp.clone();
            System.out.println(emp);
            System.out.println(empClone);
            System.out.printf("Employee == Employee Clone? %b\n", emp == empClone);
            System.out.printf("Employee Designation == Employee Clone's Designation? %b\n", emp.designation == empClone.designation);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CloneableEmployee [name=" + name + ", age=" + age + ", designation=" + designation + "]";
    }

}