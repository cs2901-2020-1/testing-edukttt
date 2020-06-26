package calculator;
public class Node{
	public String value;
  public Node left;
	public Node right;
	public int rank;

	public Node(String value_){
		this.value = value_;
		this.left = null;
		this.right = null;
		if (this.value.equals("+") || this.value.equals("-")){
			this.rank = 1;
		}
		else{
			if (this.value.equals("*") || this.value.equals("/")){
				this.rank = 2;
			}
			else{
				if (this.value.equals("^")){
					this.rank = 3;
				}
				else{
					this.rank = 0;
				}
			}
		}
	}

	public void setLeftNode(Node left_){
		this.left = left_;
	}

	public void setRightNode(Node right_){
		this.right = right_;
	}

	public void setChildren(Node left_, Node right_){
		setLeftNode(left_);
		setRightNode(right_);
	}

	public int getRank(){
		return this.rank;
	}

    public int Solve(){
      int result = 0;
        if(left==null && right==null){
        	result = Integer.parseInt(value);
        }else{
        	int leftValue = left.Solve();
        	int rightValue = right.Solve();
        	switch(value){
        		case "+": result = leftValue+rightValue; break;
        		case "-": result = leftValue-rightValue; break;
        		case "*": result = leftValue*rightValue; break;
        		case "/": result = leftValue/rightValue; break;
            default: System.exit(1);
        	}
        }
      return result;
	}
}
