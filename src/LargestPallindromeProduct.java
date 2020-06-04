import java.util.Scanner;
public class LargestPallindromeProduct{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long max=0;
        long rangeStart=(long)Math.pow(10,n-1)+1;
        long rangeEnd=(long)Math.pow(10,n);
        for(long i=rangeStart;i<rangeEnd;i++){
            for(long j=i;j<rangeEnd;j++){
                if(isPallindrome(i*j)){
                    max=Math.max(max,i*j);
                }
            }
    }
        System.out.println(max);
        sc.close();
    }
    private static boolean isPallindrome(long n){
        String s=Long.toString(n);
        int left=0;
        int right=s.length()-1;	
        while(left<right) {
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}