package com.sort;

/**
 * 自底向上的归并排序
 * @author lys
 *
 */
@SuppressWarnings("rawtypes")
public class MergeBU extends Example{

	private static Comparable[] aux; //辅助数组
	
	public static void sort(Comparable[] a){
		//进行logN次两两归并
		int N = a.length;
		aux = new Comparable[N];
		for (int sz = 1; sz < N; sz+=sz) {   			//sz子数组大小
			for (int lo = 0; lo < N-sz; lo+=sz+sz) {	//lo子数组索引
				merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
			}
		}
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
