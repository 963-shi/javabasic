package cn.jbit.practice;
/**
 * 第六章课外补充作业1
 * @author ShiGuocai
 */
public class NarNum {
	/**
	 * Narcissistic number水仙花数
	 * 打印100-999之间水仙花数153=1^3+5^3+3^3
	 */
	public static void main(String[] args) {
		int num=0,sum=0,temp=0;
		for(int i=153;i<999;i++) {	
			num=i;
			while(num>0) {				
				temp=num%10;
				sum+=temp*temp*temp;
				num=num/10;				
			}			
			if(sum==i) {
				System.out.print(i+"\t");
			}
			sum=0;
		}	
	}

}
