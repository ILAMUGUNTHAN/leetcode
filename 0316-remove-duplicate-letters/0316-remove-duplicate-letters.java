class Solution {
    public String removeDuplicateLetters(String s) {
        
        int li[] = new int[26];
        boolean seen[] = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            li[s.charAt(i)-'a']=i;
        }
        
        for(int i=0;i<s.length();i++)
        {
            int cur = s.charAt(i) - 'a';
            
            if(seen[cur]) continue;
            
            while(!stack.isEmpty() && stack.peek()>cur && i<li[stack.peek()]){
                seen[stack.pop()] = false;
            }
            
            stack.push(cur);
            seen[cur] = true;
            
            
        }
        StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append((char) (stack.pop()+'a'));
            }            
            return sb.reverse().toString();
            
    }
}