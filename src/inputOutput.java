import java.util.Scanner;


    class AskingQuestions {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            int num1, num2;

            System.out.print("First value? ");
            num1 = keyboard.nextInt();
            //getting first value from the user

            System.out.print("Second value? ");
            num2 = keyboard.nextInt();
            // getting second value from the user

            System.out.println("The average is : " +  (num1 + num2) / 2  );
            // printing the average for both the values
        }
    }
