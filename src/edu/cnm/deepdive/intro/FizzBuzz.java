package edu.cnm.deepdive.intro;

/**
 * This class implements the FizzBuzz game, using an upper limit specified
 * on the command line.
 *
 * @author cyeef
 */
public class FizzBuzz {
  private static final int Default_Limit = 100;
  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : Default_Limit;
    for (int i = 1; i <= limit; i++){
      System.out.println(computeResponse (i));
    }
  }

  /**
   * computes and returns the appropriate fizz/buzz/fizzbuzz/number
   * value for a given input value
   * @param value
   * @return    fizz/buzz/fizzbuzz/numeric response
   */
  private static String computeResponse(int value){
    String result = "";
        if (value % 3 == 0) {
          result += result + "fizz";

        }
        if (value % 5 == 0) {
          result += result + "buzz";
        }
        if (result.isEmpty())
    {
      //result =Interger.toString(value);
      //result = "" + value;
      //result = String.format("%d", value);
      result += value;

    }
    return result;
  }

}
