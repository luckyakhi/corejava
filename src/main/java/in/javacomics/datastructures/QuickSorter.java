package in.javacomics.datastructures;

public class QuickSorter<E extends Comparable<E>> implements Sorter<E> {

	@Override
	public E[] sort(E[] inputList) {
		quickSort(inputList, 0, inputList.length - 1);
		return inputList;
	}

	private void quickSort(E[] inputList, int i, int j) {
		int q = partition(inputList, i, j);
		if (i >= j)
			return;
		if (q > 0) {
			quickSort(inputList, i, q - 1);
		}
		if (q < inputList.length - 1)
			quickSort(inputList, q + 1, j);

	}

	private int partition(E[] inputList, int i, int j) {
		E pivot = inputList[i + (j - i) / 2];
		int left = i;
		int right = j;
		while (left < right) {
			while (inputList[left].compareTo(pivot) < 0)
				left++;
			while (right > 0 && inputList[right].compareTo(pivot) > 0)
				right--;
			if (left < right) {
				E temp = inputList[left];
				inputList[left] = inputList[right];
				inputList[right] = temp;
			}
		}
		return left;
	}

}
