package cn.jbit.sgc;
	/**
	 * 第五章循环结构课后作业2
	 * @author ShiGuocai
	 */
public class Whilepint {
	public static void main(String[] args) {
		int i=100;
		while(i>=5){
			System.out.println(i+"\n");
			i-=5;
		}		
		System.out.println("******");
		//第二种法
		i=100;
		do{
			System.out.println(i+"\n");
			i-=5;
		}while(i>0);
	}
}
