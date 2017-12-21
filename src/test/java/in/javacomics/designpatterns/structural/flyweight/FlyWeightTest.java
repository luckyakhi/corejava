package in.javacomics.designpatterns.structural.flyweight;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlyWeightTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Shape shape = ShapeFactory.getShape("greenSquare");
		shape.draw("top");
		Shape shape2 = ShapeFactory.getShape("greenSquare");
		shape2.draw("bottom");
	}

}
