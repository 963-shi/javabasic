package cn.jbit.www.sgc;

import java.util.Scanner;
/**
 * 第七章课后练习6
 * @author ShiGuocai
 */
public class ArrayString {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] musics={"Island","Ocean","Pretty","Sun"," "};
		System.out.print("插入前数组为：");
		for(int i=0;i<musics.length;i++){
			System.out.print(musics[i]+" ");
		}
		System.out.print("\n请输入歌曲名称：");
		String music=input.next();		
		int index=0;
		for(int i=0;i<musics.length;i++){
			if(musics[i].compareToIgnoreCase(music)>0){
				index=i;
				break;
			}
		}
		for(int j=musics.length-1;j>0;j--){
			musics[j]=musics[j-1];
			if(j==(index+1)){
				break;
			}
		}
		musics[index]=music;
		System.out.print("插入后的数组为：");
		for(int i=0;i<musics.length;i++){
			System.out.print(musics[i]+" ");
		}
		input.close();
	}
}
