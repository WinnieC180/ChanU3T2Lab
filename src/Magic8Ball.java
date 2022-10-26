import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";  // update this variable with the response

        // Write code here to generate a random number from 1 to 6

        // Write code here to use
        // appropriate selection statements (if, if else, else)
        // to choose from 1 of 6 responses and set response to it.
        // for example, if the number is 1, set response to "Outlook good"
        // if it’s 2, set response to "Without a doubt!"
        // etc.

        int randomNumber = (int) ((Math.random()*6) + 1);

        if (randomNumber == 1) {
            response = "I don't know, but I do know I'm hungry";
        }
        if (randomNumber ==2) {
            response = "You know you can just google it";
        }

        if (randomNumber == 3 ) {
            response = "Mhm totally";
        }

        if (randomNumber == 4) {
            response = "Yee!";
        }

        if (randomNumber == 5) {
            response = "Never";
        }

        if (randomNumber ==6){
            response = "no";
        }

        System.out.println();
        System.out.println(response);  // print response
    }
}

