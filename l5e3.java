public class l5e3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int count = 1; count <= 12; ++count) {
            int number1 = Math.random(0,12);
            int number2 = Math.random(0,12);
            int answer = number1*number2;
            int score = 0
            System.out.print("What is "+number1+" x "+number2);
            int userans = input.nextint();
            if (userans==answer) {
                System.out.print("Well Done you got it correct");
                score = score+1
            }
            else{
                System.out.print("The answer was "+ answer)
        }

    }
        System.out.print(score)
}


}



//Create a maths quiz game that loops through 10 questions,
//keeping track of score for correct answers using a selection statement.
