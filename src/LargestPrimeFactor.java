/*
* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/


import java.util.*;
public class LargestPrimeFactor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=-1;
        int n=sc.nextInt();
        for(int i=2;i<Math.sqrt(n);i++){
            while(n%i==0){
                n=n/i;
            }
            max=i;
        }
        if(n>1){
            max=Math.max(max,n);
        }
        System.out.println(max);
    }
}
