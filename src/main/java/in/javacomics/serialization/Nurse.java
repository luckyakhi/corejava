package in.javacomics.serialization;

import java.io.Serializable;

public class Nurse extends MedicalPractitioner implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8698041375134802629L;
	private String diploma;
	public Nurse(String name, String speciality, int yearsOfExp, String diploma) {
		super(name, speciality, yearsOfExp);
		this.diploma = diploma;
	}
	public String getDiploma() {
		return diploma;
	}

}
