import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int last;
        System.out.println("Enter the number:----");
        int x=sc.nextInt();
        int sum=0;
        int temp;
        temp=x;
        
        while(x!=0){
            last=x%10;
            sum=sum*10+last;
            x=x/10;
            
        }
        
        System.out.print("Reverse:--"+sum);
        
         if(temp==sum){
            System.out.println(" ");
            System.out.println("It's a palindrome number");
         }else{
            System.out.println(" ");
            System.out.println("not a palindrome number");
         }
         sc.close();
    }
   
}
