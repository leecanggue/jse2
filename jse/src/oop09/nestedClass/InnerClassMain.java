package oop09.nestedClass;
/*
내부 클래스의 첫 번째 형태
- 인스턴스 내부 클래스
- 멤버 메소드를 클래스 내부에 선언함
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
	//CTRL + Shift + m  메소드 독립 단축키
	//리팩토링


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
