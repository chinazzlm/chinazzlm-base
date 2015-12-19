package com.chinazzlm.chinazzlm.algorithm;
/**
 * 常用排序算法
 * @author andy.bao
 * @date 2015年12月19日
 */
public interface CommonSort {
	/**
	 * 小鸡问题
	 * 公鸡母鸡小鸡的问题有一百块钱,公鸡5元一只,母鸡3元一只,小鸡1元3只,问分别能买多少只公鸡,母鸡,小鸡?
	 * 
	 */
    public void chick();
    /**
     * 冒泡排序
     * @param b
     */
    public void bubble_sort(int [] b);
    
    /**
     * 快速排序
     * @param q
     */
    public void quick_sort(int [] q);
}
