import java.util.Stack;

public class BalancedBrackets {

        public String checkBalance(String string){
            Stack<Character> stack= new Stack<>();

            for (int i=0;i<string.length();i++){
                char c=string.charAt(i);
                if (c=='('){
                    stack.push(c);
                }
                else if(c==')'){
                    if(stack.isEmpty()||stack.peek()!='('){
                        return "unbalanced";
                    }
                    stack.pop();
                }

            }
            if (stack.empty()){
                return "balanced";
            } else{
                return "unbalanced";
            }

        }
    }
