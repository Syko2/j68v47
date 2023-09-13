import java.util.*;


public class l3e3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the cost of a loan");
        int l = input.nextInt();

        System.out.print("please enter the interest rate, ex 5%= 0.05 ");
        float i = input.nextFloat()/12;

        System.out.print("please enter the number of years left for the loan");
        int y = input.nextInt();
        int n = y*12;

//        double m = l*(i/(1-(Math.pow(1+i,-n))));
        double m = l*( i / (1 - Math.pow(1+i,-n) ));
        System.out.print(m);
    }}



//        Create a program that asks the user to enter
//        The cost of a loan
//        The interest rate
//        The number of years for the loan
//
//        Calculate monthly payments with the following formula
//
//                M = L( i / (1 - (1+i)^-n ) )
//
//        Where
//                M = monthly payment
//                L = Loan amount
//                j = interest rate in months
//                (for interest rate of 5%APR, j = 0.05/12)
//        n = number of years * 12
