package oop02.encapsule;

public class NumberMatchService {
	NumberMatchVO number = new NumberMatchVO();
	
	void input(int input) {
		int result = 0;
		try {
			number.setPlayer(input);
		} catch (Exception e) {
			System.out.println("문자는 안됩니다.");
		}
		if (number.getPlayer() == 0) {
			System.out.println("다시 입력해 주십시오.");
		} else {
			number.setCom();
			result = game(number.getCom(), number.getPlayer());
		}
		if (result == 1) {
			System.out.println("맞췄습니다.");
			System.out.println("게임을 종료합니다.");
		}
	}
	public int game(int com, int player) {
		int result;
		if (number.getPlayer() == number.getCom()) {
			System.out.println(number.getPlayer() + "정답!!");
			result = 1;
		} else {
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + number.getCom() + " 입니다.");
			System.out.println("게임을 종료합니다.");
			result = 0;
		}
		return result;
	}
}
