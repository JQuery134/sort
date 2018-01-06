package baohuajie.sort;

import java.util.Arrays;

public class RadixSort {
	
	public static void main(String[] args) {
		int[] array = { 52, 38, 47, 24, 69, 05, 17, 38 };
		// int[] array = { 5, 17, 24, 38, 38, 47, 52, 69 };
		radixSort(array,100);
		System.out.println("最终排序结果：" + Arrays.toString(array));
	}
	
	public static void radixSort(int[] array,int d){
		int n=1;//基数，从1开始，依次增大到10,100,1000，……
		int length=array.length;
		int[][] arrayTemp=new int[10][length];//用于存放分配后的数据
		int[] order=new int[10];//记录每一个数组中存放了几个元素
		int k=0;
		//循环个位、百位、千位……
		while(n<d){
			//将待排数据放入arrayTemp中对应的数组中（分配过程）
			for(int num:array){
				int index=(num/n)%10;//确定将该元素放入哪一个数组中
				arrayTemp[index][order[index]]=num;
				order[index]++;
			}
			//将arrayTemp中的数据依次取出（收集过程）
			for(int i=0;i<10;i++){
				if(order[i]!=0){//该队列有数据，并却数据的个数为order[i]个
					for(int j=0;j<order[i];j++){
						array[k]=arrayTemp[i][j];
						k++;
					}
				}
				order[i]=0;
			}
			n=n*10;
			k=0;
		}
	}

}
