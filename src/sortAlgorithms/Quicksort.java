package sortAlgorithms;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment Quicksort Algorithm, takes an array of integers and sorts the array using the quicksort algorithm.
 */
public class Quicksort extends SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	public void quickSort(int []arr, int low, int high){
		if(low < high){
			int part = partition(arr, low, high);
			quickSort(arr, low, part);
			quickSort(arr, part + 1, high);
		}
	}
	private int partition(int [] arr, int low, int high){
		// Choose the middle element as the pivot.
		int pivot = arr[low + (high-low)/2];
		
		int i = low - 1;
		int j = high + 1;
		while(true){
			do{
				i++;
			} while(arr[i] < pivot);
				
			do{
				j--;
			}while(arr[j] > pivot);
			
			if(i >= j){
				return j;
			}
			swap(arr, i, j);
			
		}
	}
	// Swap two elements in the array given two indeces x and y.
		private void swap(int [] arr, int x, int y){
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}

}
