package in.javacomics.serialization;

public class MedicalPractitioner {
	private String name;
	private String speciality;
	private int yearsOfExp;
	public MedicalPractitioner(String name, String speciality, int yearsOfExp) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.yearsOfExp = yearsOfExp;
	}
	public String getName() {
		return name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	
}
