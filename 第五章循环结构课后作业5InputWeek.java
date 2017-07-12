package cn.jbit.sgc;
import java.util.Scanner;
/**
 * 第五章循环结构课后作业5
 * @author ShiGuocai
 */
public class InputWeek {
	public static void main(String[] args) {
		int num;
		String day="";
		Scanner input=new Scanner(System.in);
		do {
			System.out.print("请从键盘上输入1-7(输入0结束)");
			num=input.nextInt();
			switch (num) {
			case 1:
				day="MON";
				break;
			case 2:
				day="TUE";
				break;
			case 3:
				day="WED";
				break;
			case 4:
				day="THU";
				break;
			case 5:
				day="FRI";
				break;
			case 6:
				day="SAT";
				break;
			case 7:
				day="SUN";
				break;
			default:
				if(num!=0)
					System.out.println("请输入指定范围的数字，谢谢");
				break;
			}
			if(num>0&&num<8){				
				System.out.println("今天是"+day);
			}
		} while (num!=0);
		System.out.println("程序结束");
		input.close();
	}
}
