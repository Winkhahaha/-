package ��ָ��Ǯ;

public class 쳲��������� {

	public static void main(String[] args) {
		System.out.println(Fibonacci(3));
	}
	/*
	 * ����һ������n���������쳲��������еĵ�n��
	 */
	public static int Fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}
		if(n > 2) {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
		return -1;

    }
}
