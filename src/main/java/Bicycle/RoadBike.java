package Bicycle;

import BicycleService.RoadBikeService;

public class RoadBike extends Bicycle{
    private int tireWidth;

    public RoadBike(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public RoadBike(int cadence, int speed, int gear, int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    @Override
    public void printDescription(){
        System.out.println("Bike is in gear "+getGear()+" with a cadence of "+getCadence()+" and traveling at a speed of "+getSpeed()+" tire width is "+getTireWidth()+" mm.");
    }

    public void visit(RoadBikeService bs){
        bs.accept(this);
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }
}
