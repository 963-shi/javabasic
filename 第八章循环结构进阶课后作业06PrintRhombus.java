package cn.jbit.sgc;

import java.util.Scanner;

/**
 * �ڰ���ѭ���ṹ���׿κ���ҵ06
 * @author ShiGuocai *
 */
public class PrintRhombus {

	public static void main(String[] args) {
		//��ӡ����
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int rows=input.nextInt();
		while (rows%2==0) {
			System.out.print("������������");
			rows=input.nextInt();
		}
		int n=(rows+1)/2;
		//��ӡ���ε��ϰ벿��
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
