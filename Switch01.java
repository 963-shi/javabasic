package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * 第四章课后作业第2题
 * 
 * @author ShiGuoCai
 *
 */
public class Switch01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几(1-7):");
		int weekday = input.nextInt();

		switch (weekday) {
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程！");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("学习英语！");
			break;
		case 7:
			System.out.println("休息！");
			break;
		default:
			System.out.println("你输入有误,请重新输入。");
			break;
		}
		input.close();

	}

}
