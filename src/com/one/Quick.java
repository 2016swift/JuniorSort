package com.one;

/**
 * 快速排序
 * @author lys
 *
 */
@SuppressWarnings("rawtypes")
public class Quick extends Example{
	
	public static void sort(Comparable[] a){
		sort(a, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi){
		if(hi <= lo)	return;
		int j = partition(a, lo, hi);	//切分
		sort(a, lo, j-1);				//将左半部a[lo...j-1]排序
		sort(a, j+1, hi);				//将右半部a[j+1...hi]排序
	}
	
	private static int partition(Comparable[] a, int lo, int hi){
		//将数组切分为a[lo...i-1], a[i], a[i+1...hi]
		int i = lo, j = hi+1;		//左右扫描指针
		Comparable v = a[lo];		//切分元素
		while(true){
			//扫描左右，检查扫描是否结束并交换元素
			while(less(a[++i], v))	if(i==hi) break;
			while(less(v, a[--j]))	if(j==lo) break;
			if(i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);				//将v = a[j]放入正确的
		return j;					//a[lo...j-1] <= a[j] <= a[j+1...hi]达成
	}
}
