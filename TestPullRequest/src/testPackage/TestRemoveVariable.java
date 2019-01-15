package testPackage;

public class TestRemoveVariable {

	// Useless comment
	private int a;
	private int b;
	private int c = this.a;

	public int getA() {
		return this.a;
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
	
	public void doOtherStuff() {
		int k = a;
	}

}
