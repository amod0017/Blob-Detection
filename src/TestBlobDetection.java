import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBlobDetection {

	private Solution myClassUnderTest;

	@Before
	public void setup() {
		myClassUnderTest = new Solution();
	}

	@Test
	public void testSample1() {
		final int[][] input = new int[6][8];
		final int[][] expectedOutput = new int[6][];
		input[0] = new int[] { 1, 1, 0, 1, 1, 1, 0, 1 };
		input[1] = new int[] { 1, 1, 0, 0, 0, 1, 0, 1 };
		input[2] = new int[] { 1, 1, 1, 0, 0, 0, 0, 1 };
		input[3] = new int[] { 0, 0, 0, 0, 1, 0, 0, 1 };
		input[4] = new int[] { 1, 0, 1, 0, 1, 0, 0, 1 };
		input[5] = new int[] { 0, 1, 0, 0, 0, 0, 1, 1 };

		expectedOutput[0] = new int[] { 1, 1, 0, 2, 2, 2, 0, 3 };
		expectedOutput[1] = new int[] { 1, 1, 0, 0, 0, 2, 0, 3 };
		expectedOutput[2] = new int[] { 1, 1, 1, 0, 0, 0, 0, 3 };
		expectedOutput[3] = new int[] { 0, 0, 0, 0, 4, 0, 0, 3 };
		expectedOutput[4] = new int[] { 5, 0, 5, 0, 4, 0, 0, 3 };
		expectedOutput[5] = new int[] { 0, 5, 0, 0, 0, 0, 3, 3 };
		final int[][] output = myClassUnderTest.blobDetect(input);
		Assert.assertArrayEquals(expectedOutput, output);
	}

	@Test
	public void testSample2() {
		final int[][] input = new int[6][];
		final int[][] expectedOutput = new int[6][];
		input[0] = new int[] { 1, 0, 1, 0, 1, 0 };
		input[1] = new int[] { 0, 1, 0, 0, 1, 1 };
		input[2] = new int[] { 0, 0, 0, 0, 0, 0 };
		input[3] = new int[] { 0, 0, 1, 0, 0, 1 };
		input[4] = new int[] { 0, 1, 0, 1, 0, 0 };
		input[5] = new int[] { 1, 0, 0, 0, 1, 0 };

		expectedOutput[0] = new int[] { 1, 0, 1, 0, 2, 0 };
		expectedOutput[1] = new int[] { 0, 1, 0, 0, 2, 2 };
		expectedOutput[2] = new int[] { 0, 0, 0, 0, 0, 0 };
		expectedOutput[3] = new int[] { 0, 0, 3, 0, 0, 4 };
		expectedOutput[4] = new int[] { 0, 3, 0, 3, 0, 0 };
		expectedOutput[5] = new int[] { 3, 0, 0, 0, 3, 0 };
		// myClassUnderTest.printArray(input);
		final int[][] output = myClassUnderTest.blobDetect(input);
		// myClassUnderTest.printArray(output);
		Assert.assertArrayEquals(expectedOutput, output);
	}

	// discussed in code review
	@Test
	public void testSample3() {
		final int[][] input = new int[6][];
		final int[][] expectedOutput = new int[6][];
		input[0] = new int[] { 1, 0, 0, 0, 0, 1 };
		input[1] = new int[] { 1, 0, 0, 0, 0, 1 };
		input[2] = new int[] { 1, 0, 0, 0, 0, 1 };
		input[3] = new int[] { 1, 0, 0, 0, 0, 1 };
		input[4] = new int[] { 1, 0, 0, 0, 0, 1 };
		input[5] = new int[] { 1, 1, 1, 1, 1, 1 };

		expectedOutput[0] = new int[] { 1, 0, 0, 0, 0, 1 };
		expectedOutput[1] = new int[] { 1, 0, 0, 0, 0, 1 };
		expectedOutput[2] = new int[] { 1, 0, 0, 0, 0, 1 };
		expectedOutput[3] = new int[] { 1, 0, 0, 0, 0, 1 };
		expectedOutput[4] = new int[] { 1, 0, 0, 0, 0, 1 };
		expectedOutput[5] = new int[] { 1, 1, 1, 1, 1, 1 };
		myClassUnderTest.printArray(input);
		final int[][] output = myClassUnderTest.blobDetect(input);
		myClassUnderTest.printArray(output);
		Assert.assertArrayEquals(expectedOutput, output);
	}

	@Test
	public void testSample4() {
		final int[][] input = new int[6][];
		final int[][] expectedOutput = new int[6][];
		input[0] = new int[] { 1, 0, 0, 0, 0, 1 };
		input[1] = new int[] { 1, 0, 0, 0, 1, 1 };
		input[2] = new int[] { 1, 0, 0, 1, 0, 1 };
		input[3] = new int[] { 1, 0, 1, 0, 0, 1 };
		input[4] = new int[] { 1, 1, 0, 0, 0, 1 };
		input[5] = new int[] { 1, 0, 0, 0, 0, 1 };

		expectedOutput[0] = new int[] { 1, 0, 0, 0, 0, 1 };
		expectedOutput[1] = new int[] { 1, 0, 0, 0, 1, 1 };
		expectedOutput[2] = new int[] { 1, 0, 0, 1, 0, 1 };
		expectedOutput[3] = new int[] { 1, 0, 1, 0, 0, 1 };
		expectedOutput[4] = new int[] { 1, 1, 0, 0, 0, 1 };
		expectedOutput[5] = new int[] { 1, 0, 0, 0, 0, 1 };
		myClassUnderTest.printArray(input);
		final int[][] output = myClassUnderTest.blobDetect(input);
		myClassUnderTest.printArray(output);
		Assert.assertArrayEquals(expectedOutput, output);
	}
}
