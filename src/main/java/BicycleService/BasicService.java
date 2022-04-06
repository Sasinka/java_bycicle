package BicycleService;

import Bicycle.Bicycle;
import Bicycle.MountainBike;


public class BasicService {
    public BasicService() {
    }

    public void accept(Bicycle bicycle){
        if(bicycle instanceof MountainBike){
            System.out.println("Fixing Mountain Bike.");
        }else{
            System.out.println("Can't fix");
        }
    }



    //public abstract void accept(MountainBike bike);
}
