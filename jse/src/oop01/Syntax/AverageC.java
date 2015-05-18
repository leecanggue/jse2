package oop01.Syntax;

public class AverageC {
	public static void main(String[] args) {
		
	AverageVO hulk = new AverageVO();
	String name = "ÇæÅ©";
	int kor = 100 ;
	int eng = 70 ;
	
	hulk.setName(name);
	hulk.setKor(kor);
	hulk.setEng(eng);
	
	System.out.println("==="+hulk.getName()+"ÀÇ ¼ºÀûÇ¥===");
	System.out.println("±¹¾î : "+hulk.getKor()+"Á¡");
	System.out.println("¿µ¾î : "+hulk.getEng()+"Á¡");
	System.out.println("ÃÑÁ¡ : "+hulk.tot()+"Á¡");
	System.out.println("Æò±Õ : "+hulk.avg()+"Á¡");
	System.out.println();
	}
}
