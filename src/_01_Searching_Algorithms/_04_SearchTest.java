package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] unsorted = {"hi", "bye", "Chargers"};
		String[] sorted = {"hi", "hello", "Chargers"};
		String[] sorted2 = {"hi", "hello", "bye"};
		assertEquals(1, _00_LinearSearch.linearSearch(unsorted, "bye"));
		assertEquals(-1, _00_LinearSearch.linearSearch(sorted, "bye"));
		assertEquals(2, _00_LinearSearch.linearSearch(sorted2, "bye"));
	}
	

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] unsorted = {0, 1, 2, 4, 6};
		int[] sorted = {0, 3, 3, 4, 6};
		int[] sorted2 = {0, 3, 3, 4, 4};
		assertEquals(3, _01_BinarySearch.binarySearch(unsorted, 0, 6, 3));
		assertEquals(2, _01_BinarySearch.binarySearch(sorted, 0, 6, 2));
		assertEquals(4, _01_BinarySearch.binarySearch(sorted2, 0, 4, 4));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] unsorted = {0, 1, 2, 3, 4};
		int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		int[] sorted2 = {0, 1, 2};
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(unsorted, 3));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(sorted, 4));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(sorted2, 3));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
