class Solution {
    public String interpret(String command) {
        
        if(command.contains("(al)") || command.contains("()")){
            command = command.replace("(al)","al");
            command = command.replace("()","o");
            interpret(command);
        }
        
        return command;
    }
}