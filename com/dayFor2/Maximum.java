package com.dayFor2;

public class Maximum {
	public static void main(String[] args) {
		int[]nums = {6,8,9,3,5,7};
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		System.out.println(max);
	}

}
