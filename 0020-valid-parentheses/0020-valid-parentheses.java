class Solution {
    public boolean isValid(String s) {
        Stack<Character> validParantheses = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch =='[' ){
                validParantheses.push(ch);
            }else {
                if (validParantheses.isEmpty()){
                    return false;
                }
                char top = validParantheses.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
                }
             }
            return validParantheses.isEmpty(); 
        }

    }
