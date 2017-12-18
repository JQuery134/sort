package baohuajie.sort;

import java.util.Arrays;
public class QuickSort {
	public static void quickSort(int[] array, int left, int right) {
		int i = left;
		int j = right;
		int temp = 0;
		int time=0;
		if (left < right) {
			temp = array[left];
 			while (i != j) {
				while (j > i && array[j] >= temp) {
					j--;
				}
				if (j > i) {
					array[i] = array[j];
					i++;
				}
				while (j > i && array[i] <= temp) {
					i++;
				}
				if (j > i) {
					array[j] = array[i];
					j--;
				}
			}
			array[i] = temp;
			System.out.println("第"+time+"次排序结果：" + Arrays.toString(array));
			time++;
			quickSort(array, left, i - 1);
			quickSort(array, i + 1, right);
		}
	}
	public static void main(String[] args) {
//		int[] array = { 52, 38, 47, 24, 69, 05, 17, 38 };
		int[] array = { 24, 3, 52, 38};
		quickSort(array, 0, array.length - 1);
		System.out.println("最终排序结果：" + Arrays.toString(array));
	}
}
