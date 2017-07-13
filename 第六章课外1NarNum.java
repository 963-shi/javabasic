package cn.jbit.practice;
/**
 * �����¿��ⲹ����ҵ1
 * @author ShiGuocai
 */
public class NarNum {
	/**
	 * Narcissistic numberˮ�ɻ���
	 * ��ӡ100-999֮��ˮ�ɻ���153=1^3+5^3+3^3
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
