import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   String msg = """
          Let's play the game!
          Guess the number i guessed..
          0 to 10, you got a lot of tries)
           """;
   boolean isRunning = true;

           while (isRunning) {
               System.out.println(msg);
               String input = scanner.nextLine();
               if(input.equals("0")){
                   System.out.println("Sorry. but no");
               }
               if(input.equals("1")){
                   System.out.println("No!");
               }
               if(input.equals("2")){
                   System.out.println("You lose(");
               }
               if(input.equals("3")){
                   System.out.println("Yes! You win");
                   isRunning= false;
               }
               if(input.equals("4")){
                   System.out.println("Try again");
               }
               if(input.equals("5")){
                   System.out.println("False");
               }
               if(input.equals("6")){
                   System.out.println("Oh.No");
               }if(input.equals("7")){
                   System.out.println("Not true");
               }if(input.equals("8")){
                   System.out.println("Try again");
               }if(input.equals("9")){
                   System.out.println("No.");
               }if(input.equals("10")){
                   System.out.println("Maybe, but no.");
               }





           }
        }
    }
