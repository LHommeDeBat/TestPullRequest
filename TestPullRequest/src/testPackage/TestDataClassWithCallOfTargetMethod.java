package testPackage;

public class TestDataClassWithCallOfTargetMethod {

	public int getLineOfCallerMethodInDifferentFile() {
		new TestDataClassRemoveParameter().getLineOfMethodWithUnusedParameter(1, 2, 3);
		return 5;
	}

}
