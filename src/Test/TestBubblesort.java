package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sortAlgorithms.Bubblesort;
import sortAlgorithms.SortingAlgorithm;

public class TestBubblesort {

	@Test
	public void test() {
		SortingAlgorithm bs = new Bubblesort();
		int[] arr = { 2, 3, 1, 5, 4};
		
		assertEquals(false, bs.isSorted(arr));
		bs.sort(arr);
		assertEquals(true, bs.isSorted(arr));
	}
	
	@Test
	public void alreadySorted() {
		SortingAlgorithm bs = new Bubblesort();
		int[] arr = { 1, 2, 3, 4, 5};
		
		assertEquals(true, bs.isSorted(arr));
		bs.sort(arr);
		assertEquals(true, bs.isSorted(arr));
	}

}
