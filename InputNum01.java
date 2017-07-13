package cn.jbit.practice;
import java.util.Scanner;
	/**
	 * 第六章课外补充作业2
	 * @author ShiGuocai
	 */
public class InputNum01 {
	public static void main(String[] args) {
		/*输入一个正整数N，判断该数是不是质数，是质数输出该数
		 * 不是质数输出提示N不是质数，提示：质数的含义：除了1
		 * 和它被身没有其它数能够整除（使用for循环实现）*/
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num=input.nextInt();
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
			if(count>2) {
//				break;		//比continue执行次数少
				continue;//会比break多执行
			}
		}
		if(count<=2) {
			System.out.println(num+"是质数");
		}else {
			System.out.println(num+"不是质数");
		}		
		input.close();
	}

}
