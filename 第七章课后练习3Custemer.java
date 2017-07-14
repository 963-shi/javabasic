package cn.jbit.www.sgc;
/**
 * 第七章课后练习3
 * @author ShiGuocai
 */
public class Custemer {	
	public static void main(String[] args) {
		int[] points=new int[]{18,25,7,36,13,2,89,63};
		int min=0,index=0;
		for(int i=0;i<points.length-1;i++){			
			if(points[i]<points[i+1]){			
				min=points[i];
				index=i;
			}
		}
		System.out.println(min+"下标为"+index);
	}
}
