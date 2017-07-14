package cn.jbit.www.sgc;
/**
 * µÚÆßÕÂ¿ÎºóÁ·Ï°5
 * @author ShiGuocai
 */
public class ArrayNew {
	public static void main(String[] args) {
		int[] array=new int[] {1,3,-1,5,-2};
		int[] newArray=new int[array.length];
		for(int i=0,j=array.length-1;i<array.length;i++,j--){
			if(array[i]>0){
				newArray[j]=array[i];				
			}else{
				newArray[j]=0;				
			}			
		}
		for(int j=0;j<newArray.length;j++){
			System.out.print(newArray[j]+" ");
		}
	}
}
