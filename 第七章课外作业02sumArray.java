package practice;

import java.util.Arrays;
/**
 * �����¿�����ҵ02
 * @author ShiGuocai *
 */
public class sumArray {

	public static void main(String[] args) {
		int[] arr1={1,7,9,11,13,15,17,19};
		int[] arr2={2,4,6,8,10};
		int[] arr3=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println("�ϲ���������Ϊ��"+Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println("�ϲ�������������Ϊ��"+Arrays.toString(arr3));

	}

}
