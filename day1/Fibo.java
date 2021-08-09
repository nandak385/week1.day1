package week1.day1;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range=8;
		int firstNumber=0;
		int secondNumber=1;
		int sumInTheSeries;
		
		System.out.println(firstNumber);
		
		for (int i = 2; i < range; i++) {

			sumInTheSeries = firstNumber + secondNumber; 

			firstNumber = secondNumber;

			secondNumber = sumInTheSeries;

			System.out.println(sumInTheSeries);

		}
		
	}

}
