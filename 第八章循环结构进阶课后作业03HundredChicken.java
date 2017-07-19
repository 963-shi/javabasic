package cn.jbit.sgc;
/**
 * 第八章循环结构进阶课后作业03
 * @author ShiGuocai *
 */
public class HundredChicken {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		boolean isExit=false;
		for ( i = 0; i < 20; i++) {
			for ( j = 0; j < 33; j++) {
				k=100-i-j;
				if((5*i+3*j+k/3)==100 && i!=0 && j!=0 && k!=0 && k%3==0) {
					isExit=true;
					break;
				}
			}
			if(isExit) {
				break;
			}
		}//end out for
		System.out.println("i="+i+"  j="+j+"  k="+k);
	}

}
