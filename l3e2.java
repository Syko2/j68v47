import java.util.*;


public class l3e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of Spain");
        String ans1 = input.nextLine();
        System.out.println(ans1.toLowerCase().contains("madrid"));

        System.out.print("What is the capital of Russia");
        String ans2 = input.nextLine();
        System.out.println(ans2.toLowerCase().contains("moscow"));

        System.out.print("What is the capital of England");
        String ans3 = input.nextLine();
        System.out.println(ans3.toLowerCase().contains("london"));


    }}





//    Create a program that displays three quiz questions to the user and asks them to enter the answers to each of the questions e.g. Q1. What is the capital of Spain?
//
//        The user is able to enter the following:
//
//        The capital of Spain is MADRID.
//
//        and the computer displays True if it can match any of the text the user enters to the answer “madrid”.
//
//        and the computer displays False if it cannot match any of the text to the correct answer.