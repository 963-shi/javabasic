package cn.jbit.practice;
/**
 * �����¿κ���ҵ3
 * @author ShiGuocai
 */
public class ChookRabbitNum {
	public static void main(String[] args) {
		/*�ʼ��ø��ж���ֻ
		 *chookNum+rabbitNum=35;
		 *2*chookNum+4rabbitNum=94;
		 *ʹ��ѭ���ṹ�������
		 */
		int chookNum=0,rabbitNum=0;		
		boolean totalnum=false;
		for(chookNum=0;chookNum<=35;chookNum++) {
			for(rabbitNum=0;rabbitNum<=35-chookNum;rabbitNum++) {
				int total=2*chookNum+4*rabbitNum;
				if(total==94) {
					chookNum=35-rabbitNum;
					totalnum=true;
					break;
				}
			}
			if(totalnum) {
				break;
			}
		}
		System.out.printf("chookNum��:%dֻ��rabbitNum�У�%dֻ",chookNum,rabbitNum);
		
	}
}
