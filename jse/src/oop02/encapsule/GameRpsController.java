package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		boolean flag = true;
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);

		while (flag) {
			
			System.out.println("\n가위, 바위, 보 게임을 시작합니다.");
			System.out.println("1.가위\t2.바위\t3.보\t0.종료");
			int playerValue = scanner.nextInt();
			if(playerValue > 3 || playerValue < 0){
				service.msg(playerValue);
			}else{
				int comValue = (int) service.displayComValue();
				if (playerValue == 0) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				System.out.println("당신은 " + service.showRpsValue(playerValue)
						+ " 를 냈습니다.");
				System.out.println("컴퓨터는 " + service.showRpsValue(comValue)
						+ " 를 냈습니다.");
				String winner = service.showWinner(playerValue, comValue);
				System.out.println("\n당신은 " + winner);
			}
		}
		scanner.close();
	}
}
