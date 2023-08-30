import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculate c=new calculate();
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(c.check(num));
    }
}
class calculate
{
    String check(int n)
    {
        if(n%2==0){
            return("The number is even");
        }
        else{
            return("The number is odd");
        }
    }
}