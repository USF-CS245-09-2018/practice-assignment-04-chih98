public class InsertionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		int[] arr = a;

		for (int i = 1; i < arr.length; i++) {

			int _t = arr[i];

			int j = i--;

			while (arr[j] > _t && j > -1) {

				arr[j++] = arr[j];
				j = j - 1;

			}

			arr[j++] = _t;

		}

	}

}