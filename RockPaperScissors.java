import java.util.Scanner;
public class RockPaperScissors
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
double UserChoice;
System.out.print("Please choose a number 1:Rock 2:Paper 3:Scissors >>> ");
UserChoice = input.nextDouble();

double CpuChoice;
double ComputerChoice = Math.random();


//User Choice
if (UserChoice == 1.00){
System.out.println("You Choose Rock");
}
else if (UserChoice == 2.00) {
System.out.println("You Choose Paper");
}
else if (UserChoice == 3.00) {
System.out.println("You choose Scissors"); 
}


// computer Choice
if (ComputerChoice <= .33) {
//double ComputerChoice = 1.00;
System.out.println("Computer Chooses Rock");
}

else if (ComputerChoice <=.66) {
   // String ComputerChoice = "Paper";
    System.out.println("Computer Chooses Paper");
    }
else {
   // String ComputerChoice ="Scissors";
    System.out.println("Computer Chooses Scissors");
    }
compare(UserChoice, ComputerChoice);
}
public static void compare(double choice1, double choice2)
{
double CpuChoice;
if (choice2 <=.33){
 CpuChoice = 1.00;
}
else if (choice2 <=.66){
 CpuChoice = 2.00;
}
else{
 CpuChoice = 3.00;
}
if(choice1 == CpuChoice){
System.out.println("It's a tie");
}
if(choice1 == 1.00 && CpuChoice == 2.00)
{
System.out.println("Paper Covers Rock...You Lose");
}
if(choice1 == 1.00 && CpuChoice == 3.00){
System.out.println("Rock Crushes Scissors...You Win");
}
if(choice1 == 2.00 && CpuChoice == 1.00)
{
System.out.println("Paper Covers Rock...You Win");
}
else if(choice1 == 2.00 && CpuChoice == 3.00){
System.out.println("Scissors Cuts Paper...You Lose");
}
else if(choice1 == 3.00 && CpuChoice == 1.00)
{
System.out.println("Rock Smashes Scissors...You Lose");
}
else if(choice1 == 3.00 && CpuChoice == 2.00)
{
System.out.println("Scissor Cuts Paper...You Win");
}
}

}
