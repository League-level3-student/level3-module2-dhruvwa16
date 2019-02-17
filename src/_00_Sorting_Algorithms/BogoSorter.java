package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";

	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int j = 0; j < 1999999999; j++) {
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				j++;
			}
		}
		if(j==0) {
			j= 1999999999;
		}
		else {
		Random rand = new Random();
		int n = rand.nextInt(array.length-1) + 1;
		Random rand2 = new Random();
		int n2 = rand2.nextInt(array.length-1) + 1;
		int first = array[n];
		int second = array[n2];
		array[n2]= first;
		array[n] = second;
		display.updateDisplay();
		}
	}
	
	}
}






