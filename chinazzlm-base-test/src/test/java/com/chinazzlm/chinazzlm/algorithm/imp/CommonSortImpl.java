package com.chinazzlm.chinazzlm.algorithm.imp;

import com.chinazzlm.chinazzlm.algorithm.CommonSort;

public class CommonSortImpl implements CommonSort {

	@Override
	public void chick() {
		int x=0,y,z;
		while(x<20){
			y=0;
			while(y<33){
				z=100-x-y;
				if(5*x+3*y+z/3==100){
					System.out.println("x-"+x+" y-"+y+" z-"+z);
				}
				y++;
			}
			x++;
		}
		 
		
	}

	@Override
	public void bubble_sort(int[] b) {
		int temp=0;
		for(int i=0;i<b.length;i++){
			for(int j=i;j<b.length;j++){
				if(b[i]>b[j]){
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
	}
	
	 

	@Override
	public void quick_sort(int[] q) {
		// TODO Auto-generated method stub

	}

}
