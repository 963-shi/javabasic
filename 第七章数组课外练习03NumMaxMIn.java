package cn.jbit.pratice;

import java.util.Arrays;
/**
 * ���������������ϰ03
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
		System.out.println("����������Ԫ�أ�"+Arrays.toString(nums));
		System.out.println("����Ԫ��֮��Ϊ��"+sum);
		System.out.println("����Ԫ�����ֵΪ��"+Max);
		System.out.println("����Ԫ����СֵΪ��"+Min);
	}

}
