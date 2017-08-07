
public class Solution {
	int region = 0;

	public int[][] blobDetect(final int[][] input) {
		final boolean visited[][] = new boolean[input.length][input[0].length];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				detect(i, j, input, visited);
			}
		}
		return input;
	}

	public void printArray(final int[][] input) {
		for (final int[] element : input) {
			for (final int element2 : element) {
				System.out.print(element2 + " ");
			}
			System.out.println(" ");
		}

		System.out.println(" ");
	}

	private void detect(final int i, final int j, final int[][] input, final boolean[][] visited) {

		if ((input[i][j] == 1) && !visited[i][j]) {
			region++;
			markNeighborsInSameRegion(i, j, visited, input);
		}
	}

	// doing the actual DFS
	private void markNeighborsInSameRegion(final int i, final int j, final boolean[][] visited, final int[][] input) {
		final int rows = input.length - 1;
		final int cols = input[0].length - 1;
		final boolean isRowsOutOfBound = (i < 0) && (i >= rows);
		final boolean isColOutOfBound = (j < 0) && (j >= cols);
		final boolean isOutOfBound = isRowsOutOfBound || isColOutOfBound;
		if (isOutOfBound || visited[i][j]) {
			return;
		}
		visited[i][j] = true;
		input[i][j] = region;
		if (((i - 1) >= 0) && ((i - 1) <= rows) && ((j - 1) >= 0) && ((j - 1) <= cols) && (input[i - 1][j - 1] != 0)
				&& !visited[i - 1][j - 1]) {
			markNeighborsInSameRegion(i - 1, j - 1, visited, input);
		}
		if (((i - 1) >= 0) && ((i - 1) <= rows) && (j >= 0) && (j <= cols) && (input[i - 1][j] != 0)
				&& !visited[i - 1][j]) {
			markNeighborsInSameRegion(i - 1, j, visited, input);
		}
		if (((i - 1) >= 0) && ((i - 1) <= rows) && ((j + 1) >= 0) && ((j + 1) <= cols) && (input[i - 1][j + 1] != 0)
				&& !visited[i - 1][j + 1]) {
			markNeighborsInSameRegion(i - 1, j + 1, visited, input);
		}
		if ((i >= 0) && (i <= rows) && ((j - 1) >= 0) && ((j - 1) <= cols) && (input[i][j - 1] != 0)
				&& !visited[i][j - 1]) {
			markNeighborsInSameRegion(i - 1, j, visited, input);
		}
		if ((i >= 0) && (i <= rows) && ((j + 1) >= 0) && ((j + 1) <= cols) && (input[i][j + 1] != 0)
				&& !visited[i][j + 1]) {
			markNeighborsInSameRegion(i, j + 1, visited, input);
		}
		if (((i + 1) >= 0) && ((i + 1) <= rows) && ((j - 1) >= 0) && ((j - 1) <= cols) && (input[i + 1][j - 1] != 0)
				&& !visited[i + 1][j - 1]) {
			markNeighborsInSameRegion(i + 1, j - 1, visited, input);
		}
		if (((i + 1) >= 0) && ((i + 1) <= rows) && (j >= 0) && (j <= cols) && (input[i + 1][j] != 0)
				&& !visited[i + 1][j]) {
			markNeighborsInSameRegion(i + 1, j, visited, input);
		}
		if (((i + 1) >= 0) && ((i + 1) <= rows) && ((j + 1) >= 0) && ((j + 1) <= cols) && (input[i + 1][j + 1] != 0)
				&& !visited[i + 1][j + 1]) {
			markNeighborsInSameRegion(i + 1, j + 1, visited, input);
		}
	}
}
