package cn.jbit.sgc;
import java.util.Scanner;
/**
 * �ڰ���ѭ���ṹ���׿κ���ҵ02
 * @author ShiGuocai *
 */
public class InputNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���������֣���ӡͼ����");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		input.close();
	}
}
