package oop01.Syntax;

/*
 Date : 
 Author : 
 Desc : static 예제
 */
public class CardVO {

	private String kind; // 카드의 무늬
	private int number; // 카드의 숫자
	static int width = 100; // 카드의 폭
	static int height = 250; // 카드의 높이

	public CardVO(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return this.kind;
	}

	public int getNumber() {
		return this.number;
	}
}