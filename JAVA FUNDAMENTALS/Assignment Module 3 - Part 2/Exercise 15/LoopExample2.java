import java.util.Scanner;
public class LoopExample2 {
    public static void main(String[] args){
        int n, sum=0;
        System.out.println("Enter the Numbers of terms");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.printf("Sum of first %d number is %d",n,sum);
    }
}

