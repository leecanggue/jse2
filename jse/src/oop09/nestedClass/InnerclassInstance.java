package oop09.nestedClass;
/*
���� Ŭ����(Inner Class) ù��° ����.
- �ν��Ͻ� ���� Ŭ����
- ����޼ҵ带 Ŭ���� ���ο� ������.
 */
public class InnerclassInstance {
	int a = 10 ;
	private int b = 100 ;
	static int c = 200 ;
	
	public class Inner{
		public void printData(){
			System.out.println("������� a : " + a);
			System.out.println("�����̺����� b : " + b);
			System.out.println("����ƽ���� c : " + c);
		}
	}
}
