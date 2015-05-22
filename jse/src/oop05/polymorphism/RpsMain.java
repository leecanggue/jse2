package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다.");
		boolean flag = true;
		while (flag) {
			System.out.println("\n1.가위\n2.바위\n3.보자기\n0.종료 \n숫자를 입력하세요.");
			int playerVal = scanner.nextInt();
			if (playerVal == 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			RpsService service = new RpsServiceImpl();
			if (playerVal < 4 && playerVal > 0) {
				System.out.println("플레이어는 " + service.showRpsVal(playerVal)
						+ "를 냈습니다.");
				int comVal = service.displayComVal();
				System.out.println("컴퓨터는 " + service.showRpsVal(comVal)
						+ "를 냈습니다.\n");
				String winner = service.showWinner(playerVal, comVal);
				System.out.println(winner);
			} else {
				System.out.println("잘못입력했습니다. 다시입력해주세요");
			}
		}
		scanner.close();
	}
}
