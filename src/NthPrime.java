import java.util.Scanner;

public class NthPrime {

	static final int MAX_SIZE=1000005;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean[] prime=new boolean[MAX_SIZE];
		for(int i=0;i<MAX_SIZE;i++)
			prime[i]=true;
		for(int i=2;i*i<MAX_SIZE;i++) {
			if(prime[i]){
				for(int p=i*i;p<MAX_SIZE;p+=i) {
					prime[p]=false;
				}
			}
		}
		int count=0;
		for(int i=2;i<MAX_SIZE;i++) {
			if(prime[i]) {

				count++;
				//System.out.println(i);
				
			}
			if(count==n) {
				System.out.println(i);
				break;
			}
				
		}
		sc.close();
	}

}
