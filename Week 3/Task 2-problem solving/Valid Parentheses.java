class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack<>();
        
        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}')
             return false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='['  || s.charAt(i)=='{') c.push(s.charAt(i));
            
            else if(s.charAt(i)==')'){
                if(c.size()==0 || c.peek()!='(') return false;
                else if(c.peek()=='('){
                    c.pop();
                    continue;
                }
            }
            else if(s.charAt(i)==']'){
                if(c.size()==0 || c.peek()!='[') return false;
                else if(c.peek()=='['){
                    c.pop();
                    continue;
                }
            }
            else if(s.charAt(i)=='}'){
                if(c.size()==0 || c.peek()!='{') return false;
                else if(c.peek()=='{'){
                    c.pop();
                    continue;
                }
            }
        }
        if(c.size()==0)  return true;
        else return false;        
    }
}