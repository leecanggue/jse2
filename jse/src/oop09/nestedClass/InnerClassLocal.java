package oop09.nestedClass;
/*
내부 클래스의 두번째 형태
- Local 내부 클래스에서는 외부 클래스의 멤버를 접근 하는데 있어서
- 제한이 따른다. 우선 외부 클래스의 멤버 변수는 접근할 수 있다.
- 하지만 메서드 내부의 지역변수는 접근할 수 없다.
 */
public class InnerClassLocal {
	int a = 100 ;
	public void innerTest(int k){
		int b = 200 ;
		final int c = k ;
		class Inner{
			public void getData(){
				System.out.println("맴버변수 a : " + a);
				System.out.println("상수 c : " + c);
			//	System.out.println("지역변수 b : " + b);
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}
}
