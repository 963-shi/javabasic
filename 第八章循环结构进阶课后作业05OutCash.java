package cn.jbit.sgc;
import java.util.Scanner;
/**
 * �ڰ���ѭ���ṹ���׿κ���ҵ05
 * @author ShiGuocai *
 */
public class OutCash {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String password;
		int cash;
		boolean isExit=false;
		do {
   			//����ȡ�����������3��
			System.out.print("���������룺");
			password=input.next();
			if ("111sw@".equals(password)) {
				do {
					System.out.print("�������");
					cash = input.nextInt();
					if(cash%100==0 && cash>=0 && cash <=1000) {
						System.out.println("��ȡ��"+cash+"Ԫ");
						isExit=true;
						break;
					}else {
						System.out.print("������Ľ��Ϸ������������룺");
					}
				} while (true);
			} else {
				continue;
			}			
			if(isExit) {
				break;
			}
		} while (true);
		
		System.out.println("������ɣ���ȡ����");		
		
		input.close();
	}	
}
