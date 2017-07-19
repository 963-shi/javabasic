package cn.jbit.sgcout;
import java.util.Scanner;
/**
 * 第八章循环结构进阶课外作业01
 * @author ShiGuocai *
 */
public class PrinThollowRectangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入打印输出矩形的宽：");
		int width=input.nextInt();
		System.out.print("请输入打印输出矩形的长：");
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
