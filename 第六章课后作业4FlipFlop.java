package cn.jbit.practice;
/**
 * 第六章课后作业4
 * @author hiGuocai
 */
public class FlipFlop {
	/*1-100之间遇3的倍数打印Flip,遇5的倍数打印Flop,遇同时3，5
	 * 的倍数打印FlipFlop*/
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
