package com.sort;

/**
 * 归并排序
 * @author lys
 *
 */
@SuppressWarnings("rawtypes")
public class Merge extends Example{
	
	
	private static Comparable[] aux;
	
	public static void sort(Comparable[] a){
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		//将数组a[lo...hi]排序
		if(hi <= lo) return;
		int mid = lo + (hi-lo)/2;
		sort(a, lo, mid);		//左半边排序
		sort(a, mid+1, hi);		//右半边排序
		merge(a, lo, mid, hi);	//归并结果
	}
	
	public static void merge(Comparable[] a, int lo, int mid, int hi){
		//将a[lo...mid]和a[mid+1...hi]进行归并
		int x = lo, y = mid+1;
		for (int i = lo; i <= hi; i++) {
			aux[i] = a[i];
		}
		for (int i = lo; i <= hi; i++) {
			if	  (x > mid)	a[i] = aux[y++];
			else if(y > hi)	a[i] = aux[x++];
			else if(less(aux[x], aux[y])) a[i] = aux[x++];
			else 			a[i] = aux[y++];
		}
		
	}
}
