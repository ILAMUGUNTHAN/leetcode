class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int p=points[0][1];
        int count=1;
        for(int i=1;i<points.length;i++){
            int s=points[i][0];
            int e=points[i][1];
            if(s>p){
                count++;
                p=e;
            }
        }
        return count;
    }
}