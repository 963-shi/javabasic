package cn.jbit.sgcout;
/**
 * �ڰ���ѭ���ṹ���׿�����ҵ02
 * @author ShiGuocai *
 */
public class NineNine {
	//�žų˷��ھ�
	public static void main(String[] args) {
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
