package in.javacomics.enumerations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InstrumentTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_when_enums_constructor_called() {
		Instrument instrument;
		instrument = Instrument.Equity;
		System.out.println(instrument);
	}

}
