package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		RpsUtil util = new RpsUtil();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("가위바위보 게임을 시작합니다.");
			System.out.println("1.가위, 2.바위, 3.보자기 를 입력하세요.");
			int playerVal = scanner.nextInt();

			if (playerVal < 3 && playerVal > 0) {
				System.out.println("플레이어는 " + service.showRpsVal(playerVal)
						+ "를 냈습니다.");
				int comVal = service.displayComval();
				System.out.println("컴퓨터는 " + service.showRpsVal(comVal)
						+ "를 냈습니다.");
				String winner = service.showWinner(playerVal, comVal);
				System.out.println(winner);
			} else {
				System.out.println(util.showRange(1, 3));
				System.out.println();
			}
		}
		scanner.close();
	}
}
