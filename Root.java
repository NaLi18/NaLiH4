import java.util.Scanner;
/**
 * The root class that calcylate the square root of a input number
 * Na Li
 * 2:45pm - 3:40pm, Monday
 */
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
    guess = number*0.5;
    babylonian(number,guess,iteration,tolerate);
  }
  public static void babylonian(double number1,double lastGuess,int iteration,double tolerate){
    double number2 =0.0;
    if(Math.abs(number1- lastGuess*lastGuess)<tolerate){
        System.out.println(lastGuess+" is the square root of "+number1);
        System.out.println("The recrusive method was called " +iteration+" times");
      }
    else{
      iteration++;
      number2 = lastGuess+ (number1/lastGuess);
      babylonian(number1,0.5* number2,iteration,tolerate);
  }
}
}