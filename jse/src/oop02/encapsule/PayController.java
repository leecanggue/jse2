package oop02.encapsule;


import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PayService service = new PayService();
		
		String name ;
		int salary ;
		
		
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("급여를 입력하세요.");
		salary = scanner.nextInt();
		
		
		
		/*
		 공식 ...
		 income = salary - tax ;
		 
		 PayVO : getter, setter
		 PayService : 계산로직
		 PayController 세개로 분할하세요.
		 이름과 급여는 입력받아서
		 세율 뺀 실 소득을 구하는 로직입니다.
		 */
		
		System.out.println("===== 급여내역 =====");
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + salary);
		System.out.println("세금 : " + service.tax(salary));
		System.out.println("실수령액 : " + service.CalculateIncome(name, salary));
		scanner.close();
	}
}
