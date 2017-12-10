package baohuajie.sort;

import java.util.Arrays;
/**
 * @author 包华杰
 * 2017年12月3日
 * 
 * 这里使用两种方法实现。本人认为，第二种方法更能体现插入排序的思想。
 * 本代码是在直接插入排序的基础上修改而来的，可以参考以前的一篇博客
 * “”
 */
public class ShellSort {

	public static void shellSort1(int[] array) {
		int temp;
		int d=array.length/2;
		int time=0;
		while(d>0){
			for (int i = d; i < array.length;) {
				for (int j = i; j > 0;) {
					if (array[j] < array[j - d]) {
						temp = array[j - d];
						array[j - d] = array[j];
						array[j] = temp;
					}
					j=j-d;
					time++;
					System.out.println("第" + time + "次排序结果："+ Arrays.toString(array));
				}
				i=i+d;
				
			}
			d=d/2;
		}
	}
	public static void shellSort2(int[] array) {
		int temp=0;
		int j=0;
		int time=0;
		int d=array.length/2;
		while(d>0){
			for(int i=d;i<array.length;){
				temp=array[i];
				j=i-d;
				while(j>=0 && temp<array[j]){
					array[j+d]=array[j];
					j=j-d;
				}
				array[j+d]=temp;
				i=i+d;
				
			}
			d=d/2;
			time++;
			System.out.println("第" + time + "次排序结果："
					+ Arrays.toString(array));
		}
	}
	public static void main(String[] args) {
		int[] array = { 58,46,71,95,84,25,37,58,63,12 };
		shellSort2(array);
	}
}
