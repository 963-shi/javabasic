package cn.jbit.sgc;
	/**
	 * ������ѭ���ṹ�κ���ҵ2
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
		//�ڶ��ַ�
		i=100;
		do{
			System.out.println(i+"\n");
			i-=5;
		}while(i>0);
	}
}
