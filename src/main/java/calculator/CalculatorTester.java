package calculator;
public class CalculatorTester {
  static public int test(String operation, int result){
    if(Calculator.Calculate(operation) != result){
      System.out.print("Wrong answer for ");
      System.out.println(operation);
      return 0;
    }
    return 1;
  }
}
