package cn.jbit.sgc;
import java.util.Scanner;
/**
 * �ڰ���ѭ���ṹ���׿κ���ҵ04
 * @author ShiGuocai *
 */
public class Inputthreefour {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int score,sum=0,counter=0;
		double avg;
		for (int i = 0; i < 3; i++) {
			System.out.print("�������"+(i+1)+"����\n");
			for (int j = 0; j < 4; j++) {
				System.out.print("\t��"+(j+1)+"��ѧԱ�ɼ���");
				score=input.nextInt();
				if (score>85) {
					counter++;
					sum+=score;
				}
			}
		}
		avg=sum/counter;
		System.out.println("����85�ֵ�ѧԱ"+counter+"����ƽ����Ϊ��"+avg);
		input.close();
	}
}
