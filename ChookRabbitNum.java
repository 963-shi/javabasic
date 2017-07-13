package cn.jbit.practice;
/**
 * 第六章课后作业3
 * @author ShiGuocai
 */
public class ChookRabbitNum {
	public static void main(String[] args) {
		/*问鸡兔各有多少只
		 *chookNum+rabbitNum=35;
		 *2*chookNum+4rabbitNum=94;
		 *使用循环结构解决本题
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
		System.out.printf("chookNum有:%d只；rabbitNum有：%d只",chookNum,rabbitNum);
		
	}
}
