package oop06.lotto;

public class LottoServiceImpl implements LottoService{
	private int money ;
	int[][] lottos ;
	int[][] arr ;
	
	@Override
	public void extractLottos(int money) {
		inputMoney(money);
		int count = this.getCount(money);
		int i = 0 ;
		for(count = 0; count < lottos.length ; count ++){
			while(true){
				// 내부는 구현해주세요
				// isDuplication() 메소드 사용해야 합니다.
				// 중복되지 않은 숫자이면
				// lottos[count][i]=num 의
				// 형태로 들어가게 됩니다.
			}
		}
	}

	@Override
	public void printLotto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money/1000][6];
	}

	@Override
	public int getRandomNum() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*45)+1;
	}

	@Override
	public boolean inDuplication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort(int[] array) {
		for(int i = 0 ; i < array.length-1 ; i ++){
			for(int j = 0 ; j < array.length-i-1; j++){
				if(array[j]>array[j+1]){
					//완성해 주세요
					//포털에 
					//스왑 알고리즘 검색하면 
					//다 나옵니다.
				}
			}
		}
	}

	@Override
	public int getCount(int money) {
		if(money < 1000){
			return 0 ;
		}
		return (int) Math.ceil(money/1000);
	}

}
