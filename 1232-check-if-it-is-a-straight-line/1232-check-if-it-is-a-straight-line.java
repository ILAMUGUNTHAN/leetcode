class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int arr1[]=coordinates[0];
        int arr2[]=coordinates[1];
        int x1=arr1[0];
        int y1=arr1[1];
        int x2=arr2[0];
        int y2=arr2[1];
        for(int i=2;i<coordinates.length;i++){
            int x3=coordinates[i][0];
            int y3=coordinates[i][1];
            if((y2-y1)*(x3-x1)!=(x2-x1)*(y3-y1)) return false;
        }
        return true;
    }
}