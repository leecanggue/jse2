package oop01.Syntax;

public class AverageD {
	public static void main(String[] args) {
		AverageService hulk = new AverageService();
		String name = "ÇæÅ©";
		int kor = 100 ;
		int eng = 75 ;
		hulk.setUser(name, kor, eng);
		
		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+kor+"Á¡");
		System.out.println("¿µ¾î : "+eng+"Á¡");
		System.out.println("ÃÑÁ¡ : "+hulk.tot()+"Á¡");
		System.out.println("Æò±Õ : "+hulk.avg()+"Á¡");
		System.out.println();
		}
	}

