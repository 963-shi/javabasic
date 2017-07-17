package practice;

import java.util.Arrays;
/**
 * 第七章课外作业02
 * @author ShiGuocai *
 */
public class sumArray {

	public static void main(String[] args) {
		int[] arr1={1,7,9,11,13,15,17,19};
		int[] arr2={2,4,6,8,10};
		int[] arr3=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println("合并后新数组为："+Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println("合并后新数组升序为："+Arrays.toString(arr3));

	}

}
