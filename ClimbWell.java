package cn.jbit.practice;
/**
 * 第六章课外补充作业4
 * @author ShiGuocai
 */
public class ClimbWell {

	public static void main(String[] args) {
		/*有一口井7米深，一只青蛙白天爬3米，晚上坠下2米，问这只青蛙几天能
		 * 爬出这口井*/
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
		System.out.println("青蛙"+count+"天能够爬出这口井");
	}

}
