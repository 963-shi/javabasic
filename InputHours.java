package cn.jbit.practice;
import java.util.Scanner;
/**
 * 第六章课后作业2
 * @author ShiGuocai
  */
public class InputHours {
	public static void main(String[] args) {
		/*计算平均学习时间*/
		int hour=0;
		int total=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<6;i++) {
			System.out.print("请输入周"+i+"的学习时间：");
			hour=input.nextInt();
			total+=hour;
		}
		double avg=total*1.0/5;
		System.out.printf("周一至周五每日平均学习时间是：%.2f",avg);
		input.close();
	}
}
