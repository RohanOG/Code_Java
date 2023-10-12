import java.util.Scanner;

public class continuousInputLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        int max = Integer.MIN_VALUE;                
        while(n!=0){
            System.out.println("Enter the value of n:");
            n=sc.nextInt();
            if(n>max){
                max=n;
            }
            
        }
        System.out.println("The largest number among the enterd numbers is:"+max);
        sc.close();
    }
    
}
