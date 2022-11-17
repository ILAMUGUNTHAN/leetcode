class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area=(ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1);
        long len=(long)Math.min(ax2,bx2)-(long)Math.max(ax1,bx1);
        long height=(long)Math.min(ay2,by2)-(long)Math.max(ay1,by1);
        if(len<=0||height<=0){
            return area;
        }else{
            return (int)(area- len*height);
        }
    }
}