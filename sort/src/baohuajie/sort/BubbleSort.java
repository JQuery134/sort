package baohuajie.sort;

import java.util.Arrays;

/**
 * @author 包华杰
 * 
 *         2017年12月4日
 */
public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} 			
			}
			System.out.println("第" + i + "次排序结果：" + Arrays.toString(array));
		}

	}
	/**
	 * bubbleSort改进
	 * @param array
	 */
	public static void bubbleSort1(int[] array) {
		int temp = 0;
		int exchange = 0;
		for (int i = 0; i < array.length; i++) {
			/*
			 * 找出array[i]到array[array.length-1]
			 * 中最小的“浮上来”，并标记exchange = 1
			 * 表示这个过程中有交换，说明还没有完全按
			 * 顺序排列好
			 */
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					//将小的值“浮上来”，即冒泡
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					exchange = 1;
				} else {
					exchange = 0;
				}
			}
			/*
			 * 如果exchange == 0说明array[i]到array[array.length-1]
			 * 是有序的，而此时array[0]到array[i]也是有序的，所以此时整个
			 * 序列都是有序的，结束程序
			 */
			if (exchange == 0) {
				return ;
			}
			System.out.println("第" + i + "次排序结果：" + Arrays.toString(array));
		}
	}

	public static void main(String[] args) {
		int[] array = { 52, 38, 47, 24, 69, 05, 17, 38 };
		// int[] array = { 5, 17, 24, 38, 38, 47, 52, 69 };
		bubbleSort1(array);
		System.out.println("最终排序结果：" + Arrays.toString(array));
	}

}
