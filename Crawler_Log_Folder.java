class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!logs[i].equals("../") && !logs[i].equals("./")){
                stack.push(logs[i]);
            }
            if(!stack.isEmpty() && logs[i].equals("../")){
                stack.pop();
            }
            if(logs[i].equals("./")){
                continue;
            }
        }
        int count=0;
        while(!stack.isEmpty()){
            stack.pop();
            count++;
        }
        return count;
    }
}
