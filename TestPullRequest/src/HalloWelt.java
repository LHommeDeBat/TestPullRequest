import testPackage.Calc;
import testPackage.CalcInterface2;
import testPackage.SubCalc;

public class HalloWelt {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.addition(2, 2, 2);
		calc.testEclipse();
		calc.multiplication(4, 5, 3);
		
		SubCalc calc2 = new SubCalc();
		calc2.testEclipse();
		calc2.testEclipse();
		calc2.subtraction(3, 2, 1);
		calc2.multiplication(3, 2, 1);
		
		CalcInterface2 inter2 = new Calc();
		inter2.testEclipse();
	}

}


























