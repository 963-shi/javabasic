package cn.jbit.www.sgc;

import java.util.Scanner;
/**
 * �����¿κ���ϰ6
 * @author ShiGuocai
 */
public class ArrayString {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] musics={"Island","Ocean","Pretty","Sun"," "};
		System.out.print("����ǰ����Ϊ��");
		for(int i=0;i<musics.length;i++){
			System.out.print(musics[i]+" ");
		}
		System.out.print("\n������������ƣ�");
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
		System.out.print("����������Ϊ��");
		for(int i=0;i<musics.length;i++){
			System.out.print(musics[i]+" ");
		}
		input.close();
	}
}
