package cn.jbit.sgc;
import java.util.Scanner;
/**
 * ������ѭ���ṹ�κ���ҵ4
 * @author ShiGuocai
 */
public class InputInt {
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		int num,i=0,max=0,min=0,temp=0;
		System.out.println("������һ������(����0����)");
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
			System.out.println("������һ������(����0����)");
			num=input.nextInt();			
		}while(num!=0);
		System.out.println("max="+max+"\tmin="+min);		
		//�ڶ���switch
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
			System.out.println("������һ������(����0����)");
			num=input.nextInt();	
		} while (num!=0);
		System.out.println("max="+max+"\tmin="+min);*/
		input.close();
	}
}
