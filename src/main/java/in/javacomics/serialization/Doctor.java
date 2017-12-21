package in.javacomics.serialization;

import java.io.Serializable;

public class Doctor extends HealthCareProvider implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5900409820166937309L;
	private String degree;

	public Doctor(String name, String speciality, int yearsOfExp, String degree) {
		super(name, speciality, yearsOfExp);
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

	

}
