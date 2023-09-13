import java.util.*;


public class l3e1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your First name");
        String fname = input.nextLine();
        System.out.print("enter your Last name");
        String lname = input.nextLine();
        System.out.println(fname.substring(0, 1)+lname.toLowerCase());

        System.out.print("When were you born");
        int age = input.nextInt();
        System.out.println(lname.toLowerCase().substring(0, 1)+fname.toUpperCase().substring(0,3)+age);

    }}


//        The program should then create and display a username using the following format:
//
//        1st letter of the user’s first name e.g. i
//        Whole surname (lower case) e.g. simpson
//
//        A password should also be created and displayed using the following format:
//
//        Lower case initial of surname e.g. s
//        Upper case first three letters of first name e.g. IAN
//        Year of birth e.g. 1999
//