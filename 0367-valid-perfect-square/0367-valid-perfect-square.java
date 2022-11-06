class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.sqrt(num)==(int)(Math.sqrt(num))){
            return true;
        }
        return false;
    }
}