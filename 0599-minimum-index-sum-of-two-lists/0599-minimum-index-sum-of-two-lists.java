class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String>lst=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j]) && i+j<=min){
                    if(i+j<min) lst.clear();
                    lst.add(list1[i]);
                    min=i+j;
                }
            }
            
        }
        String[] s=new String[lst.size()];
        lst.toArray(s);
        return s;
    }
}