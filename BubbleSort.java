public class BubbleSort implements SortingAlgorithm {
	
	public void sort(int[] a) {

		int[] arr = a;

		// when swapped this will be true
		boolean swp;
		swp = false;

		int index = 0;
		while (!swp) {

			index++;
			for (int i = 0; i < arr.length - index; i++) {

				if (arr[i] > arr[i+1]) {

					int _t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = _t;

					swp = true;
				}

			}

		}

	} 

}