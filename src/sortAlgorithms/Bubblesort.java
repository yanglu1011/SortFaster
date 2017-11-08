package sortAlgorithms;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment bubblesort
 */
public class Bubblesort extends SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		/* can be optimized */
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length - 1; j++){
				if (arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
