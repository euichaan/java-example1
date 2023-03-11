package algorithm;

public class SelectionSort {

	/**
	 * 1. min 값을 start로 초기화 한 후 배열을 순회하면서 min 찾기
	 * 2. min과 정렬이 안된 부분의 가장 첫 번째 item과 교체
	 * // O(n²)
	 */

	public static void swapElements(int[] array, int i, int j) {
		int temp =  array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * start로부터 시작하는 최솟값의 위치를 찾고(start 포함)
	 * 배열의 마지막 위치로 갑니다.
	 */
	public static int findLowestIndex(int[] array, int start) {
		int lowestIndex = start;
		for (int i = start; i < array.length; ++i) {
			if (array[i] < array[lowestIndex]) {
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}

	/**
	 * 선택 정렬을 사용하여 요소를 정렬합니다.
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			int j = findLowestIndex(array, i);
			swapElements(array, i, j);
		}
	}
}
