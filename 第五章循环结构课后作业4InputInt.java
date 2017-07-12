package cn.jbit.sgc;
import java.util.Scanner;
/**
 * 第五章循环结构课后作业4
 * @author ShiGuocai
 */
public class InputInt {
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		int num,i=0,max=0,min=0,temp=0;
		System.out.println("请输入一个整数(输入0结束)");
		num=input.nextInt();
		do{		
			i++;
			if(i==1){
				min=num;
			}else if(i==2){				
				max=num;
				if(max<min){
					temp=max;
					max=min;
					min=temp;
				}
			}else if(i>2){					
				if (num > max) {
					temp = max;
					max = num;
					num = temp;
				}
				if (num < min) {
					temp = num;
					num=min;
					min = temp;
				}
				if (max < min) {
					temp = max;
					max = min;
					min = temp;
				}
			}			
			System.out.println("请输入一个整数(输入0结束)");
			num=input.nextInt();			
		}while(num!=0);
		System.out.println("max="+max+"\tmin="+min);		
		//第二种switch
	/*	i=0;
		max=0;
		min=0;
		temp=0;
		do {
			i++;
			switch (i) {
			case 1:
				min=num;
				break;
			case 2:
				max=num;
				if(max<min){
					temp=max;
					max=min;
					min=temp;
				}
				break;
			default:
				if (num > max) {
					temp = max;
					max = num;
					num = temp;
				}
				if (num < min) {
					temp = num;
					num=min;
					min = temp;
				}
				if (max < min) {
					temp = max;
					max = min;
					min = temp;
				}
				break;
			}
			System.out.println("请输入一个整数(输入0结束)");
			num=input.nextInt();	
		} while (num!=0);
		System.out.println("max="+max+"\tmin="+min);*/
		input.close();
	}
}
