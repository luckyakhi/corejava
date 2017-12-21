package in.javacomics.serialization;

public abstract class HealthCareProvider {
	private String name;
	private String speciality;
	private int yearsOfExp;
	public HealthCareProvider(String name, String speciality, int yearsOfExp) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.yearsOfExp = yearsOfExp;
	}
	
	
	public HealthCareProvider() {
		super();
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
