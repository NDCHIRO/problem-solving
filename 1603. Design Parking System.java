class ParkingSystem {
    int b,m,s;
    public ParkingSystem(int big, int medium, int small) {
        b=big;
        m=medium;
        s=small;
        System.out.println(s+" "+b+" "+ m);

    }
    
    public boolean addCar(int carType) {
        //System.out.println(small+" "+big+" "+ medium);
        switch(carType)
        {
            case 3:
                if(s>0)
                {
                    s--;
                    return true;
                }
                else
                    return false;
                case 2:
                if(m>0)
                {
                    m--;
                    return true;
                }
                else
                    return false;
                case 1:
                if(b>0)
                {
                    b--;
                    return true;
                }
                else
                    return false;
        }
     return false;   
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
