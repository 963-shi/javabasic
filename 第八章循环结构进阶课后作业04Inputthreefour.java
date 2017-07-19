package cn.jbit.sgc;
import java.util.Scanner;
/**
 * 第八章循环结构进阶课后作业04
 * @author ShiGuocai *
 */
public class Inputthreefour {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int score,sum=0,counter=0;
		double avg;
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入第"+(i+1)+"个班\n");
			for (int j = 0; j < 4; j++) {
				System.out.print("\t第"+(j+1)+"个学员成绩：");
				score=input.nextInt();
				if (score>85) {
					counter++;
					sum+=score;
				}
			}
		}
		avg=sum/counter;
		System.out.println("大于85分的学员"+counter+"个，平均分为："+avg);
		input.close();
	}
}
