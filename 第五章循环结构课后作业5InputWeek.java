package cn.jbit.sgc;
import java.util.Scanner;
/**
 * ������ѭ���ṹ�κ���ҵ5
 * @author ShiGuocai
 */
public class InputWeek {
	public static void main(String[] args) {
		int num;
		String day="";
		Scanner input=new Scanner(System.in);
		do {
			System.out.print("��Ӽ���������1-7(����0����)");
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
					System.out.println("������ָ����Χ�����֣�лл");
				break;
			}
			if(num>0&&num<8){				
				System.out.println("������"+day);
			}
		} while (num!=0);
		System.out.println("�������");
		input.close();
	}
}
