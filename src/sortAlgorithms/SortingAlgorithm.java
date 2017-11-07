package sortAlgorithms;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 * 
 * @comment The abstract class of all sorting algorithm
 * 
 */
public abstract class SortingAlgorithm {
	public abstract void sort();

	/* This should simply work */
	public boolean isSort(int[] arr) {
		// just a run through to see if it is
		// sorted from small to large
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
