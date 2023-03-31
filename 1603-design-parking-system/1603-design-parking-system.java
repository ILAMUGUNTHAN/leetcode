class ParkingSystem {
    int big=0,med=0,small=0;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.small=small;
        this.med=medium;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && big>0){
            big--;
            return true;
        }
        else if(carType==2 && med>0){
            med--;
            return true;
        }
        else if(carType==3 && small>0){
            small--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */