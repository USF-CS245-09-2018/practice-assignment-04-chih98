public class SelectionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		int[] arr = a;

		// finding index of min
		for (int i = 0; i< arr.length; i++) {

			int minIndex = i;

			for (int j = i++; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {

					minIndex = j;

				}

			}

			// swapping old min with new min
			int _t = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = _t;
		}

	}

}