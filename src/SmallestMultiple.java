import java.util.Scanner;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
*/
public class SmallestMultiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int hcf=1;
		int lcm=1;
		for(int i=2;i<=n;i++) {
			int product=i*hcf;
			hcf=hcf(hcf,i);
			lcm=product/hcf;
		}
		System.out.println(lcm);
	}
	
	private static int hcf(int a,int b) {
		if(b==0)
			return a;
		return hcf(b,a%b);
	}

}
