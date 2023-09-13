import java.util.*;


public class l2e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int num1 = input.nextInt();
        System.out.print("What is the second number? ");
        int num2 = input.nextInt();

        int addans = num1 + num2;
        System.out.print((num1)+ "+" +(num2) + "=" + (addans)+"\n");
        int minans = num1 - num2;
        System.out.print((num1)+ "-" +(num2) + "=" + (minans)+"\n");
        int mulans = num1 * num2;
        System.out.print((num1)+ "x" +(num2) + "=" + (mulans)+"\n");
        int divans = num1 / num2;
        System.out.print((num1)+ "/" +(num2) + "=" + (divans)+"\n");
        float percans = num1 % num2;
        System.out.print((num1)+ "%" +(num2) + "=" + (percans)+"\n");
        double sqaans = Math.pow(num1,num2);
        System.out.print((num1)+ "^" +(num2) + "=" + (sqaans)+"\n");

    }
}