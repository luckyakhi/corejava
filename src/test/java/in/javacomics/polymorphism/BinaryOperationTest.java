package in.javacomics.polymorphism;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BinaryOperationTest {
	
	private Operator<Integer, BinaryOperator<Integer>> additon;
	
	@Parameter(0)
	public Integer input1;
	
	@Parameter(1)
	public Integer input2;
	

	@Parameter(2)
	public Integer output;
	
 
	@Test
	public void testOperate() {
		Assert.assertEquals(output, additon.operate(input1, input2, (x,y)->(x+y)));
	}
	
	@Parameters
	public static Collection<Integer[]> getParameters(){
		List<Integer[]> parameterlist = new ArrayList<Integer[]>();
		parameterlist.add(new Integer[]{1,2,3});
		parameterlist.add(new Integer[]{3,4,7});
		return parameterlist; 
	}
	
	@Before
	public void setUp() throws Exception {
		additon= new Additon();
	}

	@After
	public void tearDown() throws Exception {
	}
}
