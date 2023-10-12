import java.util.Scanner;

public class continueInputSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=1;
        while(n!=0){

            n=sc.nextInt();
            sum+=n;
            
        }
        System.out.println(sum);
        sc.close();
    }
    
    
}
