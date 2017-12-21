package in.javacomics.misc.binding;

import static org.junit.Assert.fail;

import java.util.Date;

import javax.xml.bind.JAXBException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.misc.binding.StringMarshaller;
import in.javacomics.misc.binding.User;

public class StringMarshallerTest {
	
	private StringMarshaller<User> stringMarshaller;

	@Before
	public void setUp() throws Exception {
		stringMarshaller = new StringMarshaller<User>(User.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMarshal() throws JAXBException {
		User user = new User("akhi.iitkgp@gmail.com", "Akhilesh", "Singh", new Date());
		System.out.println(stringMarshaller.marshal(user));
	}

	@Test
	public void testUnmarshal() {
		
	}

}
