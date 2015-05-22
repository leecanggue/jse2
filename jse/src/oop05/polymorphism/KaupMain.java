package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("키를 입력하세요 : ");
		double height = scanner.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = scanner.nextDouble();
		
		KaupInterface kaup = new KaupImpl();
		
		System.out.println("키 : "+height+"cm\n몸무게는 : " +weight+
				"Kg\n카우프지수 : "+kaup.getKaupIndex(height, weight)+
				"\n당신은 "+kaup.getResultMsg()+"입니다.");
		scanner.close();
	}
}
