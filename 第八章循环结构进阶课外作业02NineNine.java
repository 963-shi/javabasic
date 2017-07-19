package cn.jbit.sgcout;
/**
 * 第八章循环结构进阶课外作业02
 * @author ShiGuocai *
 */
public class NineNine {
	//九九乘法口诀
	public static void main(String[] args) {
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
