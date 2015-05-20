package oop02.encapsule;

import java.util.Random;

/*
 Date : 2015.05.15 
 Author : 이창구
 Description : 가위바위보 게임놀이
 1은 가위고 2는 바위 3은 보
 * */ 

public class GameRpsService {

	/*
	 숫자값에 따른 가위, 바위, 보 결정 로직  
	 * */
	public String showRpsValue(int playerValue) {
		String result = null;
		switch (playerValue) {
		case 1: 
			result = "가위" ;
			break;
		case 2: 
			result = "바위" ;
			break;
		case 3:
			result = "보" ;
			break;

		}
		return result ;
	}

	public int displayComValue() {
		return (int)((Math.random()*3)+1);
	}

	public String showWinner(int playerValue, int comValue) {
		String msg =null;
		
		if(playerValue > comValue){
			msg = "이겼습니다!!";
		}else if(playerValue < comValue){
			msg = "졌습니다...";
		}else{
			msg = "비겼습니다.";
		}
		return msg;
	}

	public void msg(int playerValue) {
		String msg ;
	msg = "0~3사이 수를 입력하시오";
		System.out.println(msg);
	}

} 
