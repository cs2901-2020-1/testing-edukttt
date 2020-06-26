package calculator;
import java.util.*;


public class Tree{
    private Node root;
    private Stack<Node> build = new Stack<Node>();

    public Tree(String line){
      line += " ";
      build = buildStack(line);
      root = buildTree();
    };

    private Stack<Node> buildStack(String line){
      Stack<Node> symbols = new Stack<Node>();
      Stack<Node> build = new Stack<Node>();

      for(int i=0;i<line.length() - 1;i++){
        String temp="";
        while(Character.isDigit(line.charAt(i)) && Character.isDigit(line.charAt(i+1))){

          temp=temp+line.charAt(i);
          i++;
        }

        temp=temp+line.charAt(i);


        Node slab = new Node(temp);
        if(Character.isDigit(temp.charAt(0))){
          build.push(slab);
        }
        else{
          while(!symbols.empty()){
              if(symbols.peek().getRank() >= slab.getRank() && slab.getRank() !=0){
                build.push(symbols.peek());
                symbols.pop();
              }
              else
                break;
          }
          symbols.push(slab);
        }
      }
      while(!symbols.empty()){
        build.push(symbols.peek());
        symbols.pop();
      }
      return build;
    };

    private Node buildTree(){
      if (build.empty()){
        return null;
      }
      Node cur = build.peek(); build.pop();
      Node right = build.peek();
      if(right.getRank() != 0){
        right = buildTree();
      }
      else{
        build.pop();
      }
      
      Node left = build.peek();
      if(left.getRank() != 0){
        left = buildTree();
      }
      else{
      build.pop();
      }
      cur.setLeftNode(left);
      cur.setRightNode(right);
      return cur;
    }

    public int Solve(){
      return root.Solve();
    }


}
