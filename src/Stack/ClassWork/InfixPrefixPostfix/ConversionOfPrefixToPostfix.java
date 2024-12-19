package Stack.ClassWork.InfixPrefixPostfix;

import java.util.Stack;

public class ConversionOfPrefixToPostfix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<String> res = new Stack<>();

        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                res.push("" + ch);
            }
            else{
                String v1 = res.pop();
                String v2 = res.pop();
                String ans = v1 +  v2 + ch;
                res.push(ans);
            }
        }
        System.out.println(res.peek());
    }
}
