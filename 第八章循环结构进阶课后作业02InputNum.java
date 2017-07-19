package cn.jbit.sgc;
import java.util.Scanner;
/**
 * 第八章循环结构进阶课后作业02
 * @author ShiGuocai *
 */
public class InputNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入数字，打印图案：");
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
