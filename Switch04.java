package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * �����¿κ���ҵ��5��
 * 
 * @author ShiGuoCai
 *
 */
public class Switch05 {

	public static void main(String[] args) {
		double total=0.0;
		double numOne=0.0;
		double numTwo=0.0;		
		System.out.println("�������һ����������");
		Scanner input=new Scanner(System.in);
		numOne = input.nextDouble();
		System.out.println("�������㷨��+��-������/��%");
		char opr = input.next().charAt(0);
		System.out.println("������ڶ�����������");
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
				System.out.println("����ı���������Ϊ0");
			}						
			break;
		case '%':
			if(numTwo!=0){
				total=numOne%numTwo;
			}else{
				System.out.println("����ı���������Ϊ0");
			}					
			break;
		default:
			System.out.println("��������ȷ���㷨��+��-������/��%");			
			break;
		}
//		System.out.printf("��������%.2d %c %.2d= %.2d\n",numOne,opr,numTwo,total);
		System.out.println(total);
		input.close();
	}

}
