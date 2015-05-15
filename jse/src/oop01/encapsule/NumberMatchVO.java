package oop01.encapsule;

public class NumberMatchVO {
	// vo : value object
	int player, com, count;

	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
		if (player < 1 || player > 5) {
			System.out.println("1부터 3까지의 정수만 입력 가능.");
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int) ((Math.random() * 3) + 1);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
