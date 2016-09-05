import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitTest {

	private int input;
	private boolean output;
	private EvenOddChecker evenOddChecker = new EvenOddChecker();

	public JunitTest(int input, boolean output) {
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection numbers() {
		return Arrays.asList(
				new Object[][] { 
						{ 0, true }, { 1, false }, { 2, true }, { -2, true }, { -1, false } 
				}
		);
	}

	@Test
	public void testNumber() {
		System.out.println("Input Number is : " + input);
		assertEquals(output, evenOddChecker.test(input));
	}
}