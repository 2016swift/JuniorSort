package com.priority;

/**
 * 优先级队列用例
 * @author lys
 *
 */
public class TopM {
	
	private String global = "aaa";
	
	public static void main(String[] args) {
		int [] aaa = new int[10];
		int M = aaa[0];
		System.out.println(M);
		
		
		float f = -2.75f;
		Integer i = Float.floatToIntBits(f);
		String res = Integer.toBinaryString(i);
		System.out.println(res);
	}
	
	public void ass(){
		System.out.println(global);
	}
}
