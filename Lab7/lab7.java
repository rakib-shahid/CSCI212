public class lab7 {

	public static int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {
		System.out.println("Standard Array");
		printArray(myArray);
		System.out.println("\nEven numbers");
		printArrayEven(myArray);
		System.out.println("\nArray from file");
		printArray(fillArray("twodimension.txt"));
		System.out.println("\nprintArrayEven of Array from file");
		printArrayEven(fillArray("twodimension.txt"));
	}

	private static void printArray(int[][] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}

	private static void display(int num) {
		System.out.print(num + " ");
	}

	private static void printArrayEven(int[][] theArray) {
		for (int[] x : theArray) {
			for (int y : x) {
				if (y % 2 == 0) {
					display(y);
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static int[][] fillArray(String myFile) {
		TextFileInput in = new TextFileInput(myFile);
		int rowCount = Integer.parseInt(in.readLine());
		int colCount = Integer.parseInt(in.readLine());
		int[][] outArray = new int[rowCount][colCount];
		for (int i = 0; i < rowCount; i++){
			for (int c = 0; c < colCount; c++){
				outArray[i][c] = Integer.parseInt(in.readLine());
			}
		}
		return outArray;
	}

}