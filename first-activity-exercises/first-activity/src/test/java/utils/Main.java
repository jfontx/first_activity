package utils;

public class Main extends ReflectionProxy {

    @Override
    public String getTargetClassName() {
        return "Main";
    }

	public int addTwoNumbers(int a, int b) {
		return invokeMethod("addTwoNumbers", new Class[]{int.class, int.class}, a, b);
	}

	public int multiplyTwoNumbers(int a, int b) {
		return invokeMethod("multiplyTwoNumbers", new Class[]{int.class, int.class}, a, b);
	}

	public float divideTwoNumbers(int a, int b) {
		return invokeMethod("divideTwoNumbers", new Class[]{int.class, int.class}, a, b);
	}

	public int substractTwoNumbers(int a, int b) {
		return invokeMethod("substractTwoNumbers", new Class[]{int.class, int.class}, a, b);
	}

	public boolean isNumberEven(int a){
		return invokeMethod("isNumberEven", new Class[]{int.class}, a);
	}

	public int calculateFirstRightDigit(int a){
		return invokeMethod("calculateFirstRightDigit", new Class[]{int.class}, a);
	}

	public float celciusToFahrenheit(float a){
		return invokeMethod("celciusToFahrenheit", new Class[]{float.class}, a);
	}

	public float areaOfATriangle(float height, float base){
		return invokeMethod("areaOfATriangle", new Class[]{float.class, float.class}, height, base);
	}

	public boolean isLeapYear(int year){
		return invokeMethod("isLeapYear", new Class[]{int.class}, year);
	}

    public boolean isPrime(int number) {
		return invokeMethod("isPrime", new Class[]{int.class}, number);
    }

    public int calculateFactorial(int number){
		return invokeMethod("calculateFactorial", new Class[]{int.class}, number);
    }

    public int calculateLastNFibonnacci(int number){
		return invokeMethod("calculateLastNFibonnacci", new Class[]{int.class}, number);
    }

    public int getNumberOfDigits(int number){
		return invokeMethod("getNumberOfDigits", new Class[]{int.class}, number);
    }

    public int rotateNumber(int number){
		return invokeMethod("rotateNumber", new Class[]{int.class}, number);
    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){
		return invokeMethod("sumOffirstNNumbersMultiplesOfFiveOrThree", new Class[]{int.class}, N);
    }
}
