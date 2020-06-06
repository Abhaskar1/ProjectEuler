import java.util.Scanner;

/*
 * Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
 * */
public class SumSquareDifference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sumSquare=Math.pow((n*(n+1)/2),2);
		double squareSum=n*(n+1)*(2*n+1)/6;
		
		System.out.println(sumSquare-squareSum);
		sc.close();
	}

}
