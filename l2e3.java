import java.util.*;


public class l2e3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter item 1s name");
        String name1 = input.nextLine();
        System.out.print("What is item 1s price? ");
        float price1 = input.nextFloat();
        System.out.print("enter item 2s name");
        String name2 = input.nextLine();
        System.out.print("Enter item 2s price ");
        float price2 = input.nextFloat();
        System.out.print("enter item 3s name");
        String name3 = input.nextLine();
        System.out.print("Enter item 3s price ");
        float price3 = input.nextFloat();

        System.out.print("NESMART");
        System.out.format((name1) + "....£%.2f%n", price1);
        System.out.format((name2) + "....£%.2f%n", price2);
        System.out.format((name3) + "....£%.2f%n", price3);
    }}