package ConditionalPkg;

public class SortingArray {

	public static void main(String[] args) {
		  int[][] arr = { { 1, 2, 3 }, {4, 5, 6 }, {7,8, 9},{ 10, 11, 12 } };
	        int rows = arr.length;
	        System.out.println("Rows:" + rows);
	        int cols = arr[0].length;
	        System.out.println("Cols:" + cols);
	        System.out.println("Given Matrix is");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
}