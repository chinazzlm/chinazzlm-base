package com.chinazzlm.chinazzlm.algorithm;

import org.junit.Test;

import com.chinazzlm.chinazzlm.algorithm.imp.CommonSortImpl;
/**
 * 算法测试
 * @author andy.bao
 * @date 2015年12月19日
 */
public class AlgorithmHandle {
	CommonSort sort=new CommonSortImpl();
	//chick
	@Test
	public void chick_test() {
		 sort.chick();
	}
	
	@Test
	public void bubble_sort(){
		int b []={57,58,59,62};
		sort.bubble_sort(b);
		for(int _b:b){
			System.out.println(_b);
		}
	}
}
