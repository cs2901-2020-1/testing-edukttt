package DesignPatternFacade;
public class Calculator {
    public static int Calculate(String operation){
        System.out.print(operation+"\n");
        Tree tree = new Tree(operation);
        int a = tree.Solve();
        System.out.print(a+"\n");
        return a;
    }
};
