import java.util.Scanner;

public class perfectNumber {
    /*PERFECT NUMBER */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int x=sc.nextInt();
        for(int i=1;i<x;i++)
        { 
            if(x%i==0)
                sum=sum+i;
            }
            if(sum==x){
                    System.out.println(x+" is a Perfect number");
                }
        else{
                    System.out.println(x+" not a perfect number");
                    
                }
                sc.close();
               
            
        }
        }
        
       
        
    