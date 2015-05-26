package oop09.nestedClass;
/*
���� Ŭ������ ù ��° ����
- �ν��Ͻ� ���� Ŭ����
- ��� �޼ҵ带 Ŭ���� ���ο� ������
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
	//	m.getInnerClassInstance();
	//	m.getInnerClassLocal();
	//	m.getInnerClassStatic();
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}
	//CTRL + Shift + m  �޼ҵ� ���� ����Ű
	//�����丵


	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();
		inn.printData();
	}


	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	

	public void getInnerClassInstance() {
		InnerclassInstance.Inner inn = new InnerclassInstance().new Inner() ;
		inn.printData();
	}
}
