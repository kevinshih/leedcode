package leedcode;
/**
 * 括弧
 * 
 * Input: s = "()"
Output: true
 * 
 * Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<String, String> brackets = new HashMap<>();
	    brackets.put("(", ")");
	    brackets.put("[", "]");
	    brackets.put("{", "}");
        Stack<String> STACK = new Stack<String>();
 
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='(') || (s.charAt(i)=='{') || (s.charAt(i)=='[')){
                System.out.println( Character.toString(s.charAt(i)));
                STACK.push(Character.toString(s.charAt(i)));
            }
            else if(STACK.size()!=0){
                System.out.println( Character.toString(s.charAt(i)));
                String left = brackets.get(STACK.pop());
                System.out.println( left);
                if(Character.toString(s.charAt(i)).equals(left)){
                    System.out.println( 1);
                    continue;
                }
                else{
                    System.out.println( 2);
                    return false;
                }
            }else if(i != s.length())
                return false;
                
        }
        if((STACK.size()!=0) || (s.charAt(0)==')') || (s.charAt(0)=='}') || (s.charAt(0)==']'))
            return false;
        else
            return true;
    }
    
    //另一種寫法
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 如果是左括号，则入栈
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else { // 如果是右括号，则比较其与栈顶元素是否配对
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch == ')' && stack.peek() != '(') {
                    return false;
                }
                if (ch == ']' && stack.peek() != '[') {
                    return false;
                }
                if (ch == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        // 最后栈为空则表示完全匹配完毕
        return stack.isEmpty();
    }
    
}
