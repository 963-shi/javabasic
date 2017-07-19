package cn.jbit.sgc;
import java.util.Scanner;
/**
 * 第八章循环结构进阶课后作业05
 * @author ShiGuocai *
 */
public class OutCash {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String password;
		int cash;
		boolean isExit=false;
		do {
   			//输入取款密最多输入3次
			System.out.print("请输入密码：");
			password=input.next();
			if ("111sw@".equals(password)) {
				do {
					System.out.print("请输入金额：");
					cash = input.nextInt();
					if(cash%100==0 && cash>=0 && cash <=1000) {
						System.out.println("您取了"+cash+"元");
						isExit=true;
						break;
					}else {
						System.out.print("您输入的金额不合法，请重新输入：");
					}
				} while (true);
			} else {
				continue;
			}			
			if(isExit) {
				break;
			}
		} while (true);
		
		System.out.println("交易完成，请取卡！");		
		
		input.close();
	}	
}
