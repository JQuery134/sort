package baohuajie.sort;

import java.util.Arrays;

/**
 * 
 * @author 包华杰
 * 
 * 2017年12月3日
 */
public class HalfSort {

	public static void halfSort(int[] array) {
		// 搜索区索引，初始化为0
		int low = 0;// 左边界
		int mid = 0;// 中间
		int high = 0;// 右边界
		int array_i = 0;
		// 找到array[i]需要放置的位置：即low的位置
		for (int i = 1; i < array.length; i++) {
			array_i = array[i];
			high = i - 1;
			// 只有array[i]比array[i-1]小的时候才需要和搜索区比较
			if (array_i < array[i - 1]) {
				while (low <= high) {
					mid = (low + high) / 2;
					if (array_i > array[mid]) {
						low = mid + 1;
					} else {
						high = mid - 1;
					}
				}
				// 将low到i的元素整体后移，然后将array[i]放在low的位置
				for (int j = i; j > low; j--) {
					array[j] = array[j - 1];
				}
				array[low] = array_i;
			}
			System.out.println("第" + i + "趟排序结果：" + Arrays.toString(array));
		}
	}

	public static void main(String[] args) {
		int[] array = { 8, 6, 9, 5, 4, 12, 7, 11, 10 };
		halfSort(array);
	}

}
