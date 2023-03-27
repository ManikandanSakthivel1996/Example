package com.dayFor2;

public class Minimum {
	public static void main(String[] args) {
		int[]nums = {6,8,9,3,5,2};
		int min = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<=min) {
				min=nums[i];
			}
		}
		System.out.println(min);
	}

}
