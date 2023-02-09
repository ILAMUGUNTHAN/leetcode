class Solution {
    public long distinctNames(String[] ideas) {
        List<String>[]arr=new ArrayList[26];
        
        long res=0;
        for(int i=0;i<26;i++){
            arr[i]=new ArrayList<>();
        }
        for(String i:ideas){
            arr[i.charAt(0)-'a'].add(i.substring(1));
        }
        for(int i=0;i<25;i++){
            for(int j=i+1;j<26;j++){
                Set<String>set=new HashSet<>();
                set.addAll(arr[i]);
                set.addAll(arr[j]);
                res+=(arr[i].size()-set.size())*(arr[j].size()-set.size()) *2;
            }
        }
        return res;
        
    }
    
}