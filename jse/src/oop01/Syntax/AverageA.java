package oop01.Syntax;

public class AverageA {
	String name ;
	int kor ;
	int eng ;
	
	public static void main(String[] args) {
		//tot, avg 지역변수를 선언하시고
		//아래와 같이 출력되도록 해주세요.
		AverageA Hulk = new AverageA();
		Hulk.name = "헐크";
		Hulk.kor = 100 ;
		Hulk.eng =70 ;
		int tot1 = Hulk.kor + Hulk.eng ; 
		double avg1 = tot1 /2d ;
		System.out.println("==="+Hulk.name+"의 성적표===");
		System.out.println("국어 : "+Hulk.kor+"점");
		System.out.println("영어 : "+Hulk.eng+"점");
		System.out.println("총점 : "+tot1+"점");
		System.out.println("평균 : "+avg1+"점");
		System.out.println();
		
		AverageA Iron = new AverageA();
		Iron.name = "아이언";
		Iron.kor = 68 ;
		Iron.eng =98 ;
		int tot2 = Iron.kor + Iron.eng ; 
		double avg2 = tot2 /2d ;
		System.out.println("==="+Iron.name+"의 성적표===");
		System.out.println("국어 : "+Iron.kor+"점");
		System.out.println("영어 : "+Iron.eng+"점");
		System.out.println("총점 : "+tot2+"점");
		System.out.println("평균 : "+avg2+"점");
		System.out.println();
		
		AverageA Thor = new AverageA();
		Thor.name = "토르";
		Thor.kor = 45 ;
		Thor.eng =20 ;
		int tot3 = Thor.kor + Thor.eng ; 
		double avg3 = tot3 /2d ;
		System.out.println("==="+Thor.name+"의 성적표===");
		System.out.println("국어 : "+Thor.kor+"점");
		System.out.println("영어 : "+Thor.eng+"점");
		System.out.println("총점 : "+tot3+"점");
		System.out.println("평균 : "+avg3+"점");
		System.out.println();
		//아이언
		//토르
		
	}
}
