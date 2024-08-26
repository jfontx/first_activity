public class Main {
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}

	public float divideTwoNumbers(int a, int b) {
		return a/b;
	}

	public int substractTwoNumbers(int a, int b) {
		return a-b;
	}

	public boolean isNumberEven(int a){
		boolean j = false;
		if (a%2==0){
			j = true;
		}
		return j;
	}

	public int calculateFirstRightDigit(int a){
		int b = a%10;
		if (b<0){
			b = b*-1;
		}
		return b;
	}

	public float celciusToFahrenheit(float a){
	 float f = a * 9/5+32;
	 return f;
	
	}

	public float areaOfATriangle(float height, float base){
		return base*height/2;
	
	}

	public boolean isLeapYear(int year){
		boolean j = false;
		if(year%4==0 || year%400==0){
			 j = true;	
		}
		return j;	

	}

    public boolean isPrime(int number) {
		boolean j = false;
		int vecesD=0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				vecesD = vecesD+1;
			}	
		}
		if(vecesD <= 2){
			 return j=true;
		}
		return j;
		
    }

    public int calculateFactorial(int number){
		int n = 1;
		for (int i=1; i<=number ; i++){
			n= n*i;
		}
		return n;
    }

    public int calculateLastNFibonnacci(int n){
		int a=0;
		int b= 1;
		int c=0;
		for (int i=1; i<=n ; i++){
			c=a+b;
			a=b;
			b=c;
		}
		return a;
    }

    public int getNumberOfDigits(int number){
		float a=number;
		int b=0;
		while(a>=1){
			a=a/10;
			b=b+1;
		}
		return b;

		}
	

    public int rotateNumber(int number){
		
		int b=number%10;
		int a=0;

		while (number>=1){
			b=number%10;
			a=b+(a*10);
			number=number/10;


		}
		return a;
		
		

	
	

    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){
		int a=0;
		for (int i=1; i<=N; i++){
			if(i%3==0 || i%5==0){
				a=a+i;
			}
		}
		return a;
	}

}
