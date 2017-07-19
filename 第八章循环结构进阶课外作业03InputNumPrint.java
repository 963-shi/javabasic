package cn.jbit.sgcout;
/**
 * 第八章循环结构进阶课外作业03
 * @author ShiGuocai *
 */
public class InputNumPrint {
	public static void main(String[] args) {
		//打印9行9列数字		
		for(int i=1;i<=9;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
}
