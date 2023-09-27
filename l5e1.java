import java.util.Scanner;

public class l5e1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int counts=0;
        for( int count=1; count<=12; count+=1 ) {


            counts = counts +1;
            int ans = (num*counts);
            System.out.println(num + " x " + counts + " = " + ans);
        }


    }}


//    Create a times table program
//
//        Have the user enter a base number for the times table
//
//        Display the times table from 1 to 12 for that base number
