class Solution {
    public String removeOccurrences(String s, String part) {
        return s.contains(part)?removeOccurrences(s.replaceFirst(part,""),part):s;
    }
}