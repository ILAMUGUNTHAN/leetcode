class Solution {
    public String interpret(String command) {
        
        if(command.contains("()")) command = command.replace("()","o");
        if(command.contains("(al)")){
            command = command.replace("(al)","al");
            interpret(command);
        }
        
        return command;
    }
}