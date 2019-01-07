package testPackage;

public class Calc extends SuperCalc implements CalcInterface {
	
	public final static int MULTIPLIER = 10;

	public Integer addition(int a, int b, int c) {
		return a - b;
	}
	
	public Integer subtraction(int a, int b, int c) {
		return a - b;
	}
	
	public Integer subtraction(int a, int b) {
		return a - b;
	}
	
	public Integer multiplication(int a, int b, int c) {
		return a * b;
	}

	@Override
	public void testInterface2() {
		// TODO Auto-generated method stub
	}

	@Override
	public void testEclipse() {
		// TODO Auto-generated method stub
	}
	
	public class Calc2 implements CalcInterface3 {

		@Override
		public void testEclipse() {
			// TODO Auto-generated method stub
		}
	}
}
