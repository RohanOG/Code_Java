public class leet {
    public static void main(String[] args) {
        int x=1234;
        int last,mid,first,sum=0,product=1,diff;
        while(x!=0){
            last=x%10;
            sum=sum+last;
            product=product*last;
            x=x/10;
        }
        
        diff=product-sum;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(diff);
    }
    
    


}

