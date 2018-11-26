import testPackage.Calc;
import testPackage.CalcInterface2;
import testPackage.SubCalc;

public class HalloWelt {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.addition(2, 2);
		calc.esGehtImmerNoch();
		
		SubCalc calc2 = new SubCalc();
		calc2.esGehtImmerNoch();
		calc2.esGehtImmerNoch();
		
		CalcInterface2 inter2 = new Calc();
		inter2.esGehtImmerNoch();
	}

}


























