/*
* Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/
import java.io.*;
class EvenFibonacciNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=2;
        long sum=2;
        while(b<=n){
            int temp=b;
            a=b;
            b=a+b;
            if(b%2==0)
                sum+=b;
        }
        System.out.println(sum);
    }

}