package sort.baohuajie;

import java.util.Arrays;

/**
 * @author 包华杰
 * 2017年12月3日
 * 
 * 
 * 这里使用两种方法实现。本人认为，第二种方法更能体现插入排序的思想
 */
public class DirectInsertSort {
	public static void directInsertSort1(int[] array) {
		int temp;
		int time = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
				time++;
				System.out.println("第" + time + "次排序结果："
						+ Arrays.toString(array));
			}
		}
	}
	public static void directInsertSort2(int[] array) {
		int temp=0;
		int time = 0;
		int j;
		for (int i = 1; i < array.length; i++) {
			temp=array[i];
			j=i-1;
			/**
			 * 用temp和array[j]进行比较，如果temp小于array[j]，就让array[j]后移一个位置。
			 * 直到temp>=array[j]或者j<0
			 * 最后j+1的位置就是temp要插入的位置
			 */
			while(j>=0 && temp<array[j]){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
			System.out.println("第" + i + "次排序结果："
					+ Arrays.toString(array));
		}
	}
	public static void main(String[] args) {
//		int[] array = { 1, 5, 3, 4, 2 ,0};
		int[] array = { 58,46,71,95,84,25,37,58,63,12 };
		directInsertSort2(array);
	}
}
