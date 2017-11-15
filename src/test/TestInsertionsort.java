package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sortAlgorithms.Insertionsort;
import sortAlgorithms.SortingAlgorithm;

public class TestInsertionsort {

	@Test
	public void test() {
		SortingAlgorithm is = new Insertionsort();
		int[] arr = { 2, 3, 1, 5, 4};
		
		assertEquals(false, is.isSorted(arr));
		is.sort(arr);
		assertEquals(true, is.isSorted(arr));
	}

}
