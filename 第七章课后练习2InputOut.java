package cn.jbit.www.sgc;

import java.util.Scanner;
	/**
	 * 第七章课后练习2
	 * @author Administrator
	 */
public class InputOut {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		String[] cont=new String[5];
		System.out.println("请输入5句话");	
		for(int i=0;i<cont.length;i++){					
			System.out.print("第"+(i+1)+"句话：");			
			cont[i]=input.next();
		}
		for(int i=cont.length-1;i>=0;i--){
			System.out.println(cont[i]);
		}
		input.close();
	}

}
