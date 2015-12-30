package QTest.Sample;

import junit.framework.TestCase;



public class TestCalculator extends TestCase {

	private Calculation calcEngine;



	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public TestCalculator(String arg0) {

		super(arg0);

		calcEngine = new Calculation();

		}

		// test case method name should start with test.

		public final void testAdd() {

		assertEquals(calcEngine.add(20, 30), 50);

		}

		// test case method name should start with test.

		public final void testSubtract() {

		assertEquals(calcEngine.subtract(60, 30), 30);

		}

	public void testMultiply() {
		fail("Not yet implemented");
	}

	public void testDivide() {
		fail("Not yet implemented");
	}

}
