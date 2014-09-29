package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lang.ast.Program;

/**
 * Tests name analysis
 */
@RunWith(Parameterized.class)
public class TestPrettyPrinting extends AbstractParameterizedTest {
	/**
	 * Directory where test files live
	 */
	private static final String TEST_DIR = "testfiles/prettyprint";

	/**
	 * Construct a new JastAdd test
	 * @param filename filename of test input file
	 */
	public TestPrettyPrinting(String filename) {
		super(TEST_DIR, filename);
	}

	/**
	 * Run the JastAdd test
	 */
	@Test
	public void runTest() {
		try (ByteArrayOutputStream bytes = new ByteArrayOutputStream();
				PrintStream outStream = new PrintStream(bytes)) {
			Program program = (Program) parse(inFile);
			program.prettyPrint(outStream);
			compareOutput(bytes.toString(), outFile, expectedFile);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@SuppressWarnings("javadoc")
	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return getTestParameters(TEST_DIR);
	}
}