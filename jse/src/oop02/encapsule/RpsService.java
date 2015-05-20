package oop02.encapsule;

public class RpsService {
	/*
	 * 컴퓨터가 랜덤으로 발생시킨 수 1~3까지
	 * 1. 가위 2. 바위  3. 보
	 */
	public int displayComval() {
		return (int) ((Math.random() * 3) + 1);
	}

	/*
	 * 승자를 보여주는 로직
	 */
	public String showWinner(int a, int b) {
		String winner = "";
		int c = a - b ;
		/*if(c == 0){
			winner = "무승부 입니다.";
		}else if((Math.abs(c)) == 1){
			if(a > b){
				winner = "플레이어가 이겼습니다.";
			}else{
				winner = "컴퓨터가 이겼습니다.";
			}
		}else if((Math.abs(c)) == 2){
			if(a  < b){
				winner = "컴퓨터가 이겼습니다.";
			}else{
				winner = "플레이어가 이겼습니다.";
			}
		}*/
		switch (Math.abs(c)) {
		case 0:
			winner = "무승부 입니다.";
			break;
		case 1:
			if(a > b){
			winner = "플레이어가 이겼습니다.";
			}else{
				winner = "컴퓨터가 이겼습니다.";
			}
			break;
		case 2:
			if(a > b){
				winner = "컴퓨터가 이겼습니다.";
			}else{
				winner = "플레이어가 이겼습니다.";
			}
			break;
		}
		return winner;
	}

	// 숫자에 할당된 가위, 바위, 보를 문자로 전환해서 보여주는 역할
	public String showRpsVal(int playerVal) {
		String rps = "";
		switch (playerVal) {
		case 1:
			rps = "가위" ;
			break;
		case 2:
			rps = "바위" ;
			break;
		case 3:
			rps = "보" ;
			break;
		}
		return rps;
	}

}
