class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character>stack = new ArrayDeque<>();
        for(char a : s.toCharArray()){
            if(stack.size()>0 && stack.peek() == a){
                stack.pop();
            }else{
               stack.push(reverse(a));
            }
        }
        return stack.size() == 0;
        
    }
    public char reverse(char a){
       if(a =='{'){
           return '}';
       } else if(a =='('){
           return ')';
       }else{
           return ']';
       }
    }
}
