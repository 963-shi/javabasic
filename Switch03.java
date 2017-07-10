package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * 第四章课后作业第4题
 * 
 * @author ShiGuoCai
 *
 */

public class Switch03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请选择出行月份：1-12");
		int month=input.nextInt();
		if(month>10&&month<=12){
			month=month/10;
		}
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
			int cain=input.nextInt();
			if(cain==1){
				System.out.println(5000*0.5);
			}else if(cain==2){
				System.out.println(5000*0.4);
			}else{
				System.out.println("选择舱型有误，重新输入。");
			}
			break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
			int cain1=input.nextInt();
			if(cain1==1){
				System.out.println(5000*0.9);
			}else if(cain1==2){
				System.out.println(5000*0.8);
			}else{
				System.out.println("选择舱型有误，重新输入。");
			}
			break;
		default:
			System.out.println("输入不正确。");
			break;
		}
		input.close();

	}

}
