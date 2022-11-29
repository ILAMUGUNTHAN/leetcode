class RandomizedSet {
    Map<Integer,Integer> map=new HashMap<>();
    List<Integer>l=new ArrayList<>();
    Random ran=new Random();
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        
        map.put(val,l.size());
        l.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int idx=map.remove(val);
        int las=l.remove(l.size()-1);
        if(val!=las){
            l.set(idx,las);
            map.put(las,idx);
        }
        return true;
    }
    
    public int getRandom() {
        return l.get(ran.nextInt(l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */