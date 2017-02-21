import java.util.Scanner;
public class Root{
  public static void main(String[] args){
    double number;
    double guess;
    double tolerate;
    int iteration = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("You want to get square root of: ");
    number = keyboard.nextDouble();
    if(number <=0){
      System.out.println("Your did not enter a vaild number, please innput again");
      System.out.print("You want to get square root of: ");
      number = keyboard.nextDouble();
    }
    System.out.print("How many error you will tolerate in the square root estimation?:");
    tolerate = keyboard.nextDouble();
  }
  public static void babylonian(double number1,double lastGuess,int iteration,double tolerate){
  }
}