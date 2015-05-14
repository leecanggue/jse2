package cmm04.array;

public class No03_ForLoopArrayVO {
	private int a,b,c,d,e;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	

	void forLoopArrayVO(int a, int b, int c, int d, int e) {
		
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setE(e);
		
		System.out.println("입력받은 숫자 다섯 개의 합은:");
		
		int[] arr = {getA(),getB(),getC(),getD(),getE()};
		int i = 0, sum = 0;
		
		for(; i < arr.length; i++){
			 sum += arr[i]; 
		}
		System.out.println(sum);
		
		
		
		
		
//-----------------------------------------------
	/*	int[] arr2 = new int[5];
		
		for(; i < arr2.length; i++){
			arr2[i] = i+1;
		}
		for(; i < arr2.length; i++){
			 sum += arr2[i]; 
		}
		System.out.println(sum);*/

		
	}
}
