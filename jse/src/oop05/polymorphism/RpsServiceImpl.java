package oop05.polymorphism;

public class RpsServiceImpl implements RpsService{

	@Override
	public int displayComVal() {
		return (int) ((Math.random() * 3) + 1);
		
	}

	@Override
	public String showWinner(int a, int b) {
		String winner = "";
		int c = a - b ;
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

	@Override
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
