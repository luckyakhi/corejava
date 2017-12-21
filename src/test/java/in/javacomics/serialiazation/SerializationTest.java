package in.javacomics.serialiazation;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.lang.IllegalClassException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.serialization.A;
import in.javacomics.serialization.B;
import in.javacomics.serialization.Doctor;
import in.javacomics.serialization.Nurse;

public class SerializationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_serilization_when_parent_class_is_not_serializable() throws Exception {
		Doctor doc = new Doctor("House", "Diagnostics", 30, "MD");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doctors.txt"))){
			oos.writeObject(doc);
		} 
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("doctors.txt"))){
			Doctor restoredDoc = (Doctor) ois.readObject();
			assertEquals(0, restoredDoc.getYearsOfExp());
			assertEquals("MD", restoredDoc.getDegree());
			assertNull(restoredDoc.getName());
			assertNull(restoredDoc.getSpeciality());
		}
	}
	
	@Test
	public void test_serilization() throws Exception {
		B b = new B(new A());
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doctors.txt"))){
			oos.writeObject(b);
		} 
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("doctors.txt"))){
			B restoredDoc = (B) ois.readObject();
			
		}
	}
	
	@Test(expected=InvalidClassException.class)
	public void test_serilization_when_parent_class_is_not_serializable_without_default_cons() throws Exception {
		Nurse nurse = new Nurse("Cuddy", "Pediatrician", 30, "Nursing");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nurse.txt"))){
			oos.writeObject(nurse);
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nurse.txt"))){
			ois.readObject();
		}
	}
	
	

}
