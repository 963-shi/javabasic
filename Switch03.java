package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * �����¿κ���ҵ��4��
 * 
 * @author ShiGuoCai
 *
 */

public class Switch03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ѡ������·ݣ�1-12");
		int month=input.nextInt();
		if(month>10&&month<=12){
			month=month/10;
		}
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
			int cain=input.nextInt();
			if(cain==1){
				System.out.println(5000*0.5);
			}else if(cain==2){
				System.out.println(5000*0.4);
			}else{
				System.out.println("ѡ����������������롣");
			}
			break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
			int cain1=input.nextInt();
			if(cain1==1){
				System.out.println(5000*0.9);
			}else if(cain1==2){
				System.out.println(5000*0.8);
			}else{
				System.out.println("ѡ����������������롣");
			}
			break;
		default:
			System.out.println("���벻��ȷ��");
			break;
		}
		input.close();

	}

}
