package DesignPatternFacade;
public class CalculatorTester {
  static public void test(String operation, int result){
    if(Calculator.Calculate(operation) != result){
      System.out.print("Wrong answer for ");
      System.out.println(operation);
    }
    return;
  }
}
