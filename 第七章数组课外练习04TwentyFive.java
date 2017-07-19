package cn.jbit.pratice;
/**
 * 第七章数组课外练习04
 * @author ShiGuocai *
 */
public class TwentyFive {

	public static void main(String[] args) {
		int[][] arr=new int[5][20];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int score=(int)(Math.random()*100);
				arr[i][j]=score;
			}
			for(int j=0;j<arr[i].length;j++) {
				switch (i) {
				case 0:
					System.out.print((j+1)+":C++ 平均成绩:"+arr[i][j]+"\t\t");
					break;
				case 1:
					System.out.print((j+1)+":Java平均成绩:"+arr[i][j]+"\t\t");
					break;
				case 2:
					System.out.print((j+1)+":Pyth平均成绩:"+arr[i][j]+"\t\t");
					break;
				case 3:
					System.out.print((j+1)+"C# 平均成绩:"+arr[i][j]+"\t\t");
					break;
				case 4:
					System.out.print((j+1)+": C  平均成绩:"+arr[i][j]+"\t\t");
					break;
				default:
					break;
				}				
			}
			System.out.print("\n");
		}
		int[][] newarr=new int[1][20];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				newarr[0][j]+=arr[i][j];
			}			
		}		
		double[][] newarravg=new double[1][20];
		for(int i=0;i<newarr.length;i++) {
			for(int j=0;j<newarr[i].length;j++) {
				System.out.print("第"+(j+1)+"名学员："+newarr[i][j]+"\t\t");
				newarravg[i][j]=newarr[i][j]*1.0/5;
			}
			System.out.println("\n");
			for(int j=0;j<newarr[i].length;j++) {
				System.out.printf("第%d名学员平均成绩：%.1f\t",j+1,newarravg[i][j]);				
			}
		}
	}
}
