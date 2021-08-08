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

			// Add First and Second Number and assign it to sum in the series
			sumInTheSeries = firstNumber + secondNumber; // 0 + 1 = 1

			// Assign second number to first number
			firstNumber = secondNumber;

			// Assign sum to second number
			secondNumber = sumInTheSeries;

			System.out.println(sumInTheSeries);

		}
		
	}

}
