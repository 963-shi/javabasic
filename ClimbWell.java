package cn.jbit.practice;
/**
 * �����¿��ⲹ����ҵ4
 * @author ShiGuocai
 */
public class ClimbWell {

	public static void main(String[] args) {
		/*��һ�ھ�7���һֻ���ܰ�����3�ף�����׹��2�ף�����ֻ���ܼ�����
		 * ������ھ�*/
		int count=0;
		int total=0;
		for(int i=1;i<7;i++) {			
			total+=3;
			if(total>7) {
				break;
			}else {
				count++;
				total-=2;
			}
		}		
		System.out.println("����"+count+"���ܹ�������ھ�");
	}

}
