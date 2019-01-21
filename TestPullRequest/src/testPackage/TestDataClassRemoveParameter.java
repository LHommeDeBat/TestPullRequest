package testPackage;

public class TestDataClassRemoveParameter {

	/**
	 * @param a
	 * @param b
	 *            this is the unused parameter
	 * @param c
	 * @return
	 */
	public int getLineOfMethodWithUnusedParameter(int a, int b, int c) {
		int result = (a + c) * 0;
		result = 12;
		return result;
	}

	public int getLineNumberOfCaller() {
		getLineOfMethodWithUnusedParameter(1, 2, 3);
		return 22;
	}
	
	public int testSomestuff() {
		return 3;
	}

	/**
	 * Method with unused parameter which calls another method with same parameter
	 * name. Unused parameter should still be removed.
	 * 
	 * @param a
	 *            this is the unused parameter
	 * @return
	 */
	public int getLineOfMethodWithUnusedParameter2(int a) {
		getLineOfMethodWithUnusedParameter(1, 2, 3);
		return 35;
	}

}
