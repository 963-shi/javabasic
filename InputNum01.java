package cn.jbit.practice;
import java.util.Scanner;
	/**
	 * �����¿��ⲹ����ҵ2
	 * @author ShiGuocai
	 */
public class InputNum01 {
	public static void main(String[] args) {
		/*����һ��������N���жϸ����ǲ����������������������
		 * �������������ʾN������������ʾ�������ĺ��壺����1
		 * ��������û���������ܹ�������ʹ��forѭ��ʵ�֣�*/
		Scanner input=new Scanner(System.in);
		System.out.print("������һ������");
		int num=input.nextInt();
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
			if(count>2) {
//				break;		//��continueִ�д�����
				continue;//���break��ִ��
			}
		}
		if(count<=2) {
			System.out.println(num+"������");
		}else {
			System.out.println(num+"��������");
		}		
		input.close();
	}

}
