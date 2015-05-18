package oop01.Syntax;

public class Pay {
	String name ;
	int salary ;
	static final double TAX = 0.1 ;
	
	public static void main(String[] args) {
		
		
		
		Pay p = new Pay();
		p.salary = 300 ;
		p.name = "헐크";
		System.out.println("==="+ p.name +"의 5월달 실급여는 "+(int)(p.salary*(1-TAX))+"만원 입니다.");
		p.salary = 500 ;
		p.name = "아이언맨";
		System.out.println("==="+ p.name +"의 5월달 실급여는 "+(int)(p.salary*(1-TAX))+"만원 입니다.");
		p.salary = 100 ;
		p.name = "토르";
		System.out.println("==="+ p.name +"의 5월달 실급여는 "+(int)(p.salary*(1-TAX))+"만원 입니다.");
		
	}
}
