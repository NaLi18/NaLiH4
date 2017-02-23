import java.util.Scanner;
/**
 * The root class that calcylate the square root of a input number
 * Na Li
 * 2:45pm - 3:40pm, Monday
 */
public class Root
{
  public static void main(String[] args)
  {
    //declare the type of variable appropriate 
    double number;
    double guess;
    double tolerate;
    int iteration = 0;
    
    Scanner keyboard = new Scanner(System.in);
    //Ask the user to input the number
    System.out.print("You want to get square root of: ");
    number = keyboard.nextDouble();
    
    //Call the check method
    number = check(number);
    
    //Ask the user the tolerate
    System.out.print("How many error you will tolerate in the square root estimation?:");
    tolerate = keyboard.nextDouble();
    
    //Pass the half of the number to the guess variable
    guess = number*0.5;
    
    //Call the babylonian method that is the recrusive method
    babylonian(number,guess,iteration,tolerate);
  }
  
  /**
   * The check method that checks wether the input number is valid, if not, ask the user to input again. 
   * @param number The input number
   * @return The valid number
   */
  private static double check(double number){
    if(number >0)
    { 
      //return the valid number
      return number;
    }
    else{
      //Print a error message
      //and ask the user to input the number again 
      System.out.println("Your did not enter a vaild number, please innput again");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("You want to get square root of: ");
      number = keyboard.nextDouble();
      // call itself until the input number is valid
      return check(number);
  }
  }
  /**
   * The babylonian method that calculate the square root of the number and print it out.
   * it is a recurisive method that call itself inside the method
   * @param number1 The number of the user input
   * @param lastGuess The guess of the square root
   * @param iteration How many times the recrusive method was called by itself.
   * @param tolerate How many error the user tolerate 
   */
  public static void babylonian(double number1,double lastGuess,int iteration,double tolerate){
    
    //Declare the variable number2 and give the initial value 0.0
    double number2 =0.0;
    
    //The if statement have the base case of the method
    //It prints out the message of the square root and the iteration of the recrusive method was called
    if(Math.abs(number1- lastGuess*lastGuess)<tolerate){
        System.out.println(lastGuess+" is the square root of "+number1);
        System.out.println("The recrusive method called itself " +iteration+" times");
    }
    //Else statement that call the babylonian method 
    else{
      //Increment the iteration
      iteration++;
      //Pass the value to number2
      number2 = lastGuess+ (number1/lastGuess);
      //Call the babylonian method itself
      babylonian(number1,0.5* number2,iteration,tolerate);
  }
}
}