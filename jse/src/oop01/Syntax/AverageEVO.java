package oop01.Syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	// getter setter 를 사용하지 마시고
	// 생성자로 처리해주세요
	// 단, avg() tot()은 작성해주세요
	public AverageEVO(){} //디폴드 생성자 직접작성
	
	
	public AverageEVO(String name, int kor, int eng){
		this.name = name ;
		this.kor = kor ;
		this.eng = eng ;
	}
	int tot(){
		return this.kor + this.eng ;
	}
	double avg(){
		return tot() /2d;
	}
}
