package cn.jbit.practice;
/**
 * �����¿κ���ϰ4
 * @author hiGuocai
 */
public class FlipFlop {
	/*1-100֮����3�ı�����ӡFlip,��5�ı�����ӡFlop,��ͬʱ3��5
	 * �ı�����ӡFlipFlop*/
	public static void main(String[] args) {

		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.print("FlipFlop\n");
				continue;			
			}
			if(i%3==0) {
				System.out.print("Flip\n");
				continue;
			}				
			if(i%5==0) {
				System.out.print("Flop\n");
				continue;
			}
			System.out.print(i+"\n");
		}

	}

}
