package cn.jbit.www.sgc;

import java.util.Scanner;

/**
 * 第七章课后练习4
 * @author ShiGuocai
 */
public class InputNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums=new int[10];
		int[] count=new int[4];
		System.out.println("请输入10个整数：");
		for(int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();
			int s=nums[i];
			switch (s) {
			case 1:
				count[0]=count[0]+1;
				break;
			case 2:
				count[1]=count[1]+1;
				break;
			case 3:
				count[2]=count[2]+1;
				break;			
			default:
				count[3]=count[3]+1;
				break;
			}
		}
		System.out.println("数字1的个数："+count[0]);
		System.out.println("数字2的个数："+count[1]);
		System.out.println("数字3的个数："+count[2]);
		System.out.println("非法数字的个数："+count[3]);

	}
}
