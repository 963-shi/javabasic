package cn.jbit.practice;
import java.util.Scanner;
/**
 * �����¿κ���ҵ2
 * @author ShiGuocai
  */
public class InputHours {
	public static void main(String[] args) {
		/*����ƽ��ѧϰʱ��*/
		int hour=0;
		int total=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<6;i++) {
			System.out.print("��������"+i+"��ѧϰʱ�䣺");
			hour=input.nextInt();
			total+=hour;
		}
		double avg=total*1.0/5;
		System.out.printf("��һ������ÿ��ƽ��ѧϰʱ���ǣ�%.2f",avg);
		input.close();
	}
}
