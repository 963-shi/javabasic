package com.jbit.sgc;

import java.util.Scanner;

/**
 * Java43_basic
 * �����¿κ���ҵ��2��
 * 
 * @author ShiGuoCai
 *
 */
public class Switch01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ�(1-7):");
		int weekday = input.nextInt();

		switch (weekday) {
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ��̣�");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ�");
			break;
		case 7:
			System.out.println("��Ϣ��");
			break;
		default:
			System.out.println("����������,���������롣");
			break;
		}
		input.close();

	}

}
