package cn.jbit.pratice;

import java.util.Arrays;
/**
 * 第七章数组课外练习03
 * @author ShiGuocai *
 */
public class NumMaxMIn {

	public static void main(String[] args) {
		int[] nums= {22,11,33,15,23,12,14,55};
		int sum=0,Max=nums[0],Min=nums[0];
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			
			if(Max<nums[i]) {
				Max=nums[i];
			}
			if(Min>nums[i]) {
				Min=nums[i];
			}
		}
		System.out.println("数组中所有元素："+Arrays.toString(nums));
		System.out.println("所有元素之和为："+sum);
		System.out.println("数组元素最大值为："+Max);
		System.out.println("数组元素最小值为："+Min);
	}

}
