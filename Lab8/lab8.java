import java.util.StringTokenizer;

public class lab8 {

    public static int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    public static void main(String[] args) {
        int[][] lab8Array = lab8Function("twodimension8.txt");
        // System.out.println("Displaying the array from twodimension8.txt");
        printArray(lab8Array);
    }

    private static int[][] lab8Function(String filePath) {
        TextFileInput myFile = new TextFileInput(filePath);
        String line = myFile.readLine();
        StringTokenizer arrayDims = new StringTokenizer(line, ",");
        int rowCount = Integer.parseInt(arrayDims.nextToken());
        int colCount = Integer.parseInt(arrayDims.nextToken());
        // System.out.println("rows: " + rowCount + "\ncolumns: " + colCount);
        int[][] outArray = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            line = myFile.readLine();
            StringTokenizer arrayContents = new StringTokenizer(line, ",");
            for (int c = 0; c < colCount; c++) {
                    // System.out.println(line);
                    outArray[i][c] = Integer.parseInt(arrayContents.nextToken());

            }
        }
        return outArray;
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
        for (int i = 0; i < rowCount; i++) {
            for (int c = 0; c < colCount; c++) {
                outArray[i][c] = Integer.parseInt(in.readLine());
            }
        }
        return outArray;
    }

}