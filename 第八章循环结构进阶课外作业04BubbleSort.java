package cn.jbit.sgcout;
/**
 * �ڰ���ѭ���ṹ���׿�����ҵ04
 * @author ShiGuocai *
 */
public class BubbleSort {
	public static void main(String[] args) {
		//��ð�ݽ�������int[] arr={78,9,34,84,100}
		int[] arr={78,9,34,84,100};
		int temp;
		System.out.print("ԭʼ�����飺");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i]+" ");
		}
		//ð�ݽ�������
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j > i; j--) {				
				if(arr[j] > arr[j-1] && j>0) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else if(arr[j]>arr[0]) {
					temp=arr[j];
					arr[j]=arr[0];
					arr[0]=temp;
				}
			}//end inner for
		}//end out for
		System.out.println();
		System.out.print("��������飺");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}
