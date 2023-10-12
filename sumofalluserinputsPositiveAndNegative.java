import java.util.*;
public class sumofalluserinputsPositiveAndNegative {
    /*Write a program to print the sum of negative numbers, sum of positive numbers 
    from a list of numbers (N) entered by the user.The list terminates when the user enters a zero. */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumNegative=0;
        int sumPositive=0;
       
        while(true){
    int number=sc.nextInt();
    if(number==0){
        break;
    }
    if(number>0){
       
        sumPositive+=number;
    }else if(number<0){
        
        sumNegative+=number;
    }
}
sc.close();
System.out.println("sumpositive:"+sumPositive);
System.out.println("SumNegative:"+sumNegative);
    }
}
