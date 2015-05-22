package oop05.polymorphism;

public class ServiceImpl implements NumberMatchService{
	boolean flag = true ;
	int player ;
	int comval ;
	@Override
	public int makeComVal() {
		int comval = (int)(Math.random()*2)+1;
		this.comval = comval ;
		return comval ;
	}

	@Override
	public boolean match(int player, int comval) {
		this.player = player;
		if(comval == player ){
			this.flag = true ;
		}else {
			this.flag = false ;
		}
		return this.flag ;
	}

	@Override
	public String display() {
		String msg = null ;
		if(this.flag == true){
		msg = "플레이어 : " + this.player + "\n" +
		"컴퓨터 : " + this.comval + "\n" +
		"승리"+ "\n" ;
		}else if(this.flag == false){
			msg = "플레이어 : " + this.player + "\n" +
			"컴퓨터 : " + this.comval + "\n" +
			"패배" + "\n" ;
		}
		return msg ;
	}
	
}
