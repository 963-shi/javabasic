package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * �����¿κ���ҵ��3��
 * 
 * @author ShiGuoCai
 *
 */
public class Switch02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������ɺɺͬѧ�ɼ���");
		int score=input.nextInt();
		switch (score/10) {		
		case 6:			
		case 7:
		case 8:
			System.out.println("ĸ�׸�����һ���ֻ���");
			break;
		case 9:
			System.out.println("ĸ�׸�����һ���ʼǱ����ԡ�");
			break;
		case 10:
			System.out.println("���׸�����һ������");		
			break;
		default:
			System.out.println("�ɼ�̫��û�����");
			break;
		}
		input.close();

	}

}
