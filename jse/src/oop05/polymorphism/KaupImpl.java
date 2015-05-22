package oop05.polymorphism;

public class KaupImpl implements KaupInterface{
	int idx;
	@Override
	public String getResultMsg() {
		String msg = "";
		if(idx>30){ msg = "비만";}
		else if(idx>24){ msg = "과체중";}
		else if(idx>20){ msg = "정상";}
		else if(idx>15){ msg = "저체중";}
		else if(idx>13){ msg = "마름";}
		else if(idx>10){ msg = "영양실조";}
		else{ msg = "소모증";}
		return msg;
	}

	@Override
	public int getKaupIndex(double height, double weight) {
		KaupVO vo = new KaupVO();
		vo.setHeight(height);
		vo.setWeight(weight);
		int idx = (int)(((vo.getWeight()/(vo.getHeight()*vo.getHeight()))*10000));
		this.idx = idx ;
		return idx;
	}
	
}
