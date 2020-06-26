package DesignPatternFacade;
class Main {
  public static void main(String[] args) {
    CalculatorTester.test("1+5-3",3);
    CalculatorTester.test("3+2*4",11);
	  CalculatorTester.test("1-1+4/2",2);
	  CalculatorTester.test("4*3/2",6);
	  CalculatorTester.test("4*5/2*9/5*0",0);

  }
}
