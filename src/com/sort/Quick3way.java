package com.sort;

/**
 * 三向切分的快速排序
 * @author lys
 *
 */
@SuppressWarnings("rawtypes")
public class Quick3way extends Example{
	
	public static void sort(Comparable[] a){
		sort(a, 0, a.length-1);
	}
	
	@SuppressWarnings("unchecked")
	private static void sort(Comparable[] a, int lo, int hi){
		if(hi <= lo) return;
		int lt = lo, i = lo+1, gt = hi;		//定义三个指针
		Comparable v = a[lo];
		while(i <= gt){
			int cmp = a[i].compareTo(v);
			if		(cmp < 0) exch(a, lt++, i++);
			else if (cmp > 0) exch(a, i, gt--);
			else			  i++;
		}	//现在a[lo...lt-1] < v=a[lt...gt] <a[gt+1...hi]成立
		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
	}
	
}
