package testPackage;

public class TestRemoveVariable {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void doStuff() {
		int a = 3;
		int b = 4;
		int c = a + b;
		this.b = b;
		int d = a + this.b;
		a = a + 3;
	}

}
