import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class candlesHackerank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elemets u want to enter:-");
        int x=sc.nextInt();
        int i=0;
        int count=0;
        Integer arr[]= new Integer[x];
        System.out.println("Enter the elements:-");
        for( i=0;i<x;i++){
            arr[i]=sc.nextInt();
            }  
       
        int max=Collections.max(Arrays.asList(arr));
        
        System.out.println("Maximum in the array is :"+max);
        
        for(i=0;i<x;i++){
            if(arr[i]== max){
                count++;
            }
        }
            System.out.println("Repetation:"+count);
            sc.close();
        }
        
        
    }

