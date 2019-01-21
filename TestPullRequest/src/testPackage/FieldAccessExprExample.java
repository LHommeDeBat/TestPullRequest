package testPackage;

public class FieldAccessExprExample {

	private int a;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public int getThisA() {
		return this.a;
	}
	
	public void test() {
	
		
		for (int i = 0; i < 3; i++) {
			int a = 4;
			this.a = 3;
			a = 4;
		}
		
		try {
			int a = 0;
		} catch (Exception e) {
			int a = 4;
		}
		
		int a = 0;
		a = 4;
		
	}
}
