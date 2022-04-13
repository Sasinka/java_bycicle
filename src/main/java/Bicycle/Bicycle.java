package Bicycle;

import BicycleService.BasicService;
import BicycleService.MountainService;
import BicycleService.RoadBikeService;

import Interface.visit;

public class Bicycle implements visit {
    protected int cadence;
    protected int speed;
    protected int gear;

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    public void printDescription(){
        System.out.println("Bike is in gear "+getGear()+" with a cadence of "+getCadence()+" and traveling at a speed of "+getSpeed());
    }

    @Override
    public void visit(){

    }
    
    @Override
    public void visit(BasicService bs){
        bs.accept(this);
        System.out.println(this.cadence+ " visited Bike Service");
    }
    @Override
    public void visit(MountainService bs){
        bs.accept(this);
        System.out.println(this.cadence+ " visited Mountain Service");
    }
    @Override
    public void visit(RoadBikeService bs){
        bs.accept(this);
        System.out.println(this.cadence+ " visited Road Service");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }






}
