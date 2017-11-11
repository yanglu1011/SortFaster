package sortAlgorithms;

/**
 * @authors Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment Insertionsort
 */
public class Insertionsort extends SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		int i = 1;
		while(i < arr.length){
		    int j = 1;
		    while(j > 0 && arr[j-1] > arr[j]){
		    	int temp = arr[j];
		    	arr[j] = arr[j-1];
		    	arr[j-1] = temp;
		        j--;
		    }
		    i++;
		}
	}

}
