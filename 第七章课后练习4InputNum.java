package cn.jbit.www.sgc;

import java.util.Scanner;

/**
 * �����¿κ���ϰ4
 * @author ShiGuocai
 */
public class InputNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums=new int[10];
		int[] count=new int[4];
		System.out.println("������10��������");
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
		System.out.println("����1�ĸ�����"+count[0]);
		System.out.println("����2�ĸ�����"+count[1]);
		System.out.println("����3�ĸ�����"+count[2]);
		System.out.println("�Ƿ����ֵĸ�����"+count[3]);

	}
}
