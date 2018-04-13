package com.sort;

/**
 * 选择排序
 * @author lys
 *
 */
public class Selection extends Example{
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		//将a升序排列
		int N = a.length;
		for (int i = 0; i < N; i++) {
			//将a[i]和a[i+1...N]中最小元素进行交换
			int min = i;//每次比较时最小数的索引值
			for (int j = i+1; j < a.length; j++) {
				if(less(a[j], a[min])) min = j;
			}
			exch(a, i, min);
		}
	}
	
}
