package practice;

import java.util.Arrays;
/**
 * �����¿�����ҵ01
 * @author ShiGuocai *
 */
public class FindZero {

	public static void main(String[] args) {
		 int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		 int index=0;
		 for(int i=0;i<oldArr.length;i++){
			 if(oldArr[i]==0){
				 index++;
				 continue;
			 }
		 }
		 System.out.println("ԭ�����飺"+Arrays.toString(oldArr));
		 int k=0,temp;
		 do{
			 for(int i=0;i<oldArr.length-k;i++){
				 if(oldArr[i]==0){
					 for(int j=i;j<oldArr.length;j++){
						 if(j<=oldArr.length-2){
							 temp=oldArr[j];
							 oldArr[j]=oldArr[j+1];
							 oldArr[j+1]=temp; 
						 }else if((j+1)==oldArr.length-1){
							 temp=oldArr[j];
							 oldArr[j]=oldArr[j+1];
							 oldArr[j+1]=temp; 
						 }
					 }
				 }
			 }
			 k++;
		 }while(k<=index);	 		 
		 System.out.println("ð�ݺ�ԭ����"+Arrays.toString(oldArr));
		 int[] newArr=new int[oldArr.length-index];
		 //���������г�0�������Ч���֣�����������
		 System.arraycopy(oldArr, 0, newArr, 0, oldArr.length-index);
		 //������ԭ����
		 int[] oldnewArr=new int[oldArr.length-index];
		 Arrays.copyOf(oldArr, oldnewArr.length-index);
		 System.out.println("������������"+Arrays.toString(oldArr));
		//��1�֣�������������
		 System.out.println("��1�֣�������"+Arrays.toString(Arrays.copyOf(oldArr, oldArr.length-index)));
		//��2�֣�������������
		 System.out.println("��2�֣�������newArr"+Arrays.toString(newArr));

	}

}
