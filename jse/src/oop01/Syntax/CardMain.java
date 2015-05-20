package oop01.Syntax;

public class CardMain {
	public static void main(String[] args) {

		CardVO player = new CardVO("하트", 3);
		CardVO computer = new CardVO("스페이드", 5);
		System.out.println("카드 높이 : " + CardVO.height);
		System.out.println("카드 너비 : " + CardVO.width);

		// 인스턴스 생성하셔서 아래 결과처럼
		// 출력되도록 해주세요

		System.out.println("플레이어는 " + player.getKind() + player.getNumber()
				+ " 이고");
		System.out.println("컴퓨터는 " + computer.getKind() + computer.getNumber()
				+ " 라서" + " 컴퓨터가 이겼습니다.");
		// haert, spade
	}
}
