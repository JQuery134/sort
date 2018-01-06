package baohuajie.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 52, 38, 47, 24, 69, 05, 17, 38, 73 };
		// int[] array = { 5, 17, 24, 38, 38, 47, 52, 69 };
		mergeSort(array, array.length);
		System.out.println("最终排序结果：" + Arrays.toString(array));
	}

	// 二路归并排序
	public static void mergeSort(int[] array, int n) {
		int length;
		for (length = 1; length < n; length = 2 * length) {
			mergeOneTime(array, length, n);
		}
	}

	// 一趟归并排序
	public static void mergeOneTime(int[] array, int length, int n) {
		int i;
		for (i = 0; i + 2 * length - 1 < n; i = i + 2 * length) {
			merge(array, i, i + length - 1, i + 2 * length - 1);
		}
		if (i + length - 1 < n) {
			merge(array, i, i + length - 1, n - 1);
		}
	}

	// 一次归并排序
	public static void merge(int[] array, int low, int mid, int high) {
		int[] arrayTemp = new int[high + 1];// 临时表
		int i = low;// 第一段子表的下标
		int j = mid + 1;// 第二段子表的下标
		int k = 0;// 临时表的下标

		while (i <= mid && j <= high) {// 两段子表都没有剩余就循环对比
			if (array[i] <= array[j]) {
				arrayTemp[k] = array[i];
				i++;
				k++;
			} else {
				arrayTemp[k] = array[j];
				j++;
				k++;
			}
		}
		// 第一段子表有剩余
		while (i <= mid) {
			arrayTemp[k] = array[i];
			i++;
			k++;
		}
		// 第二段子表有剩余
		while (j <= high) {
			arrayTemp[k] = array[j];
			j++;
			k++;
		}
		for (k = 0, i = low; i <= high; k++, i++) {
			array[i] = arrayTemp[k];
		}
	}
}
