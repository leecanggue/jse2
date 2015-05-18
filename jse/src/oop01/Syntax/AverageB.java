package oop01.Syntax;

public class AverageB {
	String name ;
	int kor ;
	int eng ;
	/* 메소드를 여기에 정의 하셔서*/
	/* 메소드의 객체화를 해주세요*/
	int tot(){
		int tot = this.kor + this.eng ;
		return tot ;
	}
	
	double avg(){
		double avg = tot() /2d ;
		return avg ;
	}
	
	public static void main(String[] args) {
		AverageB Hulk = new AverageB();
		Hulk.name = "헐크";
		Hulk.kor = 100 ;
		Hulk.eng = 70 ;
		
		System.out.println("==="+Hulk.name+"의 성적표===");
		System.out.println("국어 : "+Hulk.kor+"점");
		System.out.println("영어 : "+Hulk.eng+"점");
		System.out.println("총점 : "+Hulk.tot()+"점");
		System.out.println("평균 : "+Hulk.avg()+"점");
		
		System.out.println();
		
	}
}
