package cn.jbit.practice;
/**
 * �����¿��ⲹ����ҵ3
 * @author ShiGuocai
 */
public class SumTwototal {
	/*����2+22+222+2222+����ǰ8���Ƕ��٣�*/
	public static void main(String[] args) {
		int sum=1;
		int total=0;
		for(int i=1;i<=8;i++) {			
			for(int j=1;j<=i;j++) {
				if(j==1) {
					sum=sum*2;
				}else {
					sum*=10;
				}
				total+=sum;//�ۼ�
			}
			sum=1;//ѭ��֮��ع��ʼ��Ȼ������´�ѭ��
		}
		System.out.println("��Ϊ"+total);

	}

}
