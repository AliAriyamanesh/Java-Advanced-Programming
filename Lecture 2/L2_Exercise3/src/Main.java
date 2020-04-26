import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner input =new Scanner(System.in);
        IntObject mynumber=new IntObject(Integer.parseInt(input.next()));
        mynumber.isEven();
        mynumber.isNegative();
        mynumber.isOdd();
        mynumber.isPositive();
        mynumber.isZero();
    }
}
