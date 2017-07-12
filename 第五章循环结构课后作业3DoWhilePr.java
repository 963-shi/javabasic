package cn.jbit.sgc;
	/**
	 * 第五章循环结构课后作业3
	 * @author ShiGuocai
	 */
public class DoWhilePr {	
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do{
			if(i%7==0){
				sum+=i;
				System.out.println(i);
			}
			i++;
		}while(i<=50);
		System.out.println("1-50之间是7的陪数之和"+sum);		
	}
}
