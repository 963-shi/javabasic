package cn.jbit.sgc;

import java.util.Scanner;

/**
 * 第八章循环结构进阶课后作业06
 * @author ShiGuocai *
 */
public class PrintRhombus {

	public static void main(String[] args) {
		//打印菱形
		Scanner input=new Scanner(System.in);
		System.out.println("请输入菱形行数");
		int rows=input.nextInt();
		while (rows%2==0) {
			System.out.print("请输入奇数：");
			rows=input.nextInt();
		}
		int n=(rows+1)/2;
		//打印菱形的上半部分
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for (int i = n; i >0; i--) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		input.close();
	}

}
