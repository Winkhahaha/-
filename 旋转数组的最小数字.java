package ��ָ��Ǯ;

public class ��ת�������С���� {

	public static void main(String[] args) {
		int[] arr = {-1,1,2,3};
		System.out.println(minNumberInRotateArray(arr));

	}
	
	/*
	 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
	����һ���ǵݼ�(����)����������һ����ת�������ת�������СԪ�ء�
	��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
	NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0
	˵���˾�����������Сֵ.......Ū�û�����ڵ�
	 */
	
	 public static int minNumberInRotateArray(int [] array) {
		 if(array.length == 0) {
			 return 0;
		 }
		 int min = array[0];
		 for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
		    
	    }

}
