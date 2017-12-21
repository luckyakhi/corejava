package in.javacomics.designpatterns.behavioural.visitor;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VisitorDesignPatternTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Visitor hashCodeVisitor = new HashCodeVisitor();
		Visitor displayVisitor = new DisplayVisitor();
		Visitor differenceVisitor = new DifferenceCalculateVisitor();
		Host trade = new Trade(new Date(), "JPMC", "DEBT", "MS");
		hashCodeVisitor.visit(trade);
		displayVisitor.visit(trade);
		differenceVisitor.visit(trade);
	
	}

}
