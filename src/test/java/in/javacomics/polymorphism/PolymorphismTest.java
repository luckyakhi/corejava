package in.javacomics.polymorphism;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={in.javacomics.configuration.SpringConfiguration.class})
public class PolymorphismTest {
	
	@Autowired
	private FlatClient client;

	public void setClient(FlatClient client) {
		this.client = client;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		client.invokeGetPriceOfFlat();
	}

}
