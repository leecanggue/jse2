package oop01.Syntax;

public class AverageE {
	public static void main(String[] args) {

		String name = "ÇæÅ©";
		int kor = 100 ;
		int eng = 75 ;
		AverageEVO hulk = new AverageEVO(name, kor, eng);

		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+kor+"Á¡");
		System.out.println("¿µ¾î : "+eng+"Á¡");
		System.out.println("ÃÑÁ¡ : "+hulk.tot()+"Á¡");
		System.out.println("Æò±Õ : "+hulk.avg()+"Á¡");
		System.out.println();
	}
}
