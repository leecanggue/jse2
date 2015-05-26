package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	
	String data = "Hello Anonymous !!";
	
	public void print(){
		new InnerClassAnonyService() {
			
			@Override
			public void printData() {
				System.out.println("익명 내부 클래스 출력 : " + data);				
			}
		}.printData();;
	}
}
