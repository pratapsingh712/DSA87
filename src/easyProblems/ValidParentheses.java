package easyProblems;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String str = "({[]}})";

        boolean is_Valid = balancedParenthesis(str);

        System.out.println("Parenthesis is balanced : "+is_Valid);
    }

    public static boolean balancedParenthesis(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch=='{' || ch=='[') {
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char och = st.peek();
                    if(och=='(' && ch==')' || och=='{' && ch=='}' || och=='[' && ch==']'){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }

        return st.isEmpty();
    }
}
