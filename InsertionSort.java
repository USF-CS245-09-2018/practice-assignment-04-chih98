public class InsertionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		int[] arr = a;

		for (int i = 1; i < arr.length; i++) {

			int _t = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > _t) {

				arr[j + 1] = arr[j];
				j = j - 1;

			}

			arr[j + 1] = _t;

		}

	}

}