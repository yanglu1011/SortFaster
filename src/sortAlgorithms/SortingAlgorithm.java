package sortAlgorithms;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 * 
 * @comment The abstract class of all sorting algorithm
 * 
 */
public abstract class SortingAlgorithm {
	public abstract void sort(int[] arr);

	/**
	 * Check if the algorithm sorted the array correctly.
	 */
	public boolean isSorted(int[] arr) {
		// just a run through to see if it is
		// sorted from small to large
		System.out.println("checking on is sorted");
		System.out.print("-array: ");
		for (int i = 0; i < arr.length - 1; i++) {
			/** @note this will add a space at the end of the print **/
			System.out.print(arr[i] + ", ");
			if (arr[i] > arr[i + 1]) {
				System.out.println();
				System.out.println("---failed at arr[i], i = " + i);
				return false;
			}
		}
		System.out.println();
		return true;
	}
}
