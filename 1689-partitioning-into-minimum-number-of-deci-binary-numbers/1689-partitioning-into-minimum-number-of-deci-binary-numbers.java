class Solution {
    public int minPartitions(String n) {
        char ch[]=n.toCharArray();
        Arrays.sort(ch);
        return ch[ch.length-1]-'0';
    }
}