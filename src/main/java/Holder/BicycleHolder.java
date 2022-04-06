package Holder;

import Bicycle.Bicycle;

public class BicycleHolder {
    private Bicycle bycicle;

    public BicycleHolder(Bicycle bycicle){
        this.bycicle = bycicle;
    }

    public Bicycle getBycicle() {
        return bycicle;
    }

    public void setBycicle(Bicycle bycicle) {
        this.bycicle = bycicle;
    }
}
