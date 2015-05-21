package oop03.Inheritance;
class Car{
	String name = "자동차";
}
class HCar extends Car{
	String brand = "현대";
}

public class MembervarExtensDemo {
	public static void main(String[] args) {
		HCar h = new HCar();
		System.out.println(h.brand+"\t");
		System.out.println(h.name);
	}
}
