package cn.jbit.practice;
/**
 * 第六章课外补充作业3
 * @author ShiGuocai
 */
public class SumTwototal {
	/*计算2+22+222+2222+…的前8项是多少？*/
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
				total+=sum;//累加
			}
			sum=1;//循环之后回归初始化然后进入下次循环
		}
		System.out.println("和为"+total);

	}

}
