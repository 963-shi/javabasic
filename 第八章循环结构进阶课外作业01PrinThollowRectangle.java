package cn.jbit.sgcout;
import java.util.Scanner;
/**
 * �ڰ���ѭ���ṹ���׿�����ҵ01
 * @author ShiGuocai *
 */
public class PrinThollowRectangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������ӡ������εĿ�");
		int width=input.nextInt();
		System.out.print("�������ӡ������εĳ���");
		int length=input.nextInt();
		for (int i = 1; i <= width; i++) {
			if(i>1 && i<width) {
				for (int j = 1; j <= length; j++) {
					if(j>1 && j<length) {
						System.out.print("   ");
					}else {
						System.out.print(" * ");
					}					
				}
			}else {
				for (int j = 0; j < length; j++) {
					System.out.print(" * ");
				}
			}
			System.out.println();			
		}
		input.close();
	}
}
