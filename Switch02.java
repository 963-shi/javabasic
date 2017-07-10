package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * 第四章课后作业第3题
 * 
 * @author ShiGuoCai
 *
 */
public class Switch02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入刘珊珊同学成绩：");
		int score=input.nextInt();
		switch (score/10) {		
		case 6:			
		case 7:
		case 8:
			System.out.println("母亲给他买一部手机。");
			break;
		case 9:
			System.out.println("母亲给她买一部笔记本电脑。");
			break;
		case 10:
			System.out.println("父亲给她买一辆车。");		
			break;
		default:
			System.out.println("成绩太差没有礼物。");
			break;
		}
		input.close();

	}

}
