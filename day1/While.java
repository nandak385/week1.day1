package week1.day1;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =123, sum =0;
        System.out.println("The sum of number is" + " " + num);
        
    while (num != 0) {
    	
    	int rem = num % 10;
    	num = num / 10;
    	sum = rem + sum;

		
	}
        System.out.println(sum);
        
	}
	

}
