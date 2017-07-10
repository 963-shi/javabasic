package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * 第四章课后作业第5题
 * 
 * @author ShiGuoCai
 *
 */
public class Switch05 {

	public static void main(String[] args) {
		double total=0.0;
		double numOne=0.0;
		double numTwo=0.0;		
		System.out.println("请输入第一个操作数：");
		Scanner input=new Scanner(System.in);
		numOne = input.nextDouble();
		System.out.println("请输入算法：+、-、×、/、%");
		char opr = input.next().charAt(0);
		System.out.println("请输入第二个操作数：");
		numTwo = input.nextDouble();
		
		switch (opr) {
		case '+':
			total=numOne+numTwo;			
			break;
		case '-':
			total=numOne-numTwo;			
			break;
		case '*':
			total=numOne*numTwo;			
			break;
		case '/':
			if(numTwo!=0){
				total=numOne/numTwo;
			}else{
				System.out.println("输入的被除数不能为0");
			}						
			break;
		case '%':
			if(numTwo!=0){
				total=numOne%numTwo;
			}else{
				System.out.println("输入的被除数不能为0");
			}					
			break;
		default:
			System.out.println("请输入正确的算法：+、-、×、/、%");			
			break;
		}
//		System.out.printf("计算结果：%.2d %c %.2d= %.2d\n",numOne,opr,numTwo,total);
		System.out.println(total);
		input.close();
	}

}
