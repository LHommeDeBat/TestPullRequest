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
			a = 2;
			this.a = 3;
		}
		
	}
}
