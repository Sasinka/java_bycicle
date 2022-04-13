package BicycleService;

import Bicycle.Bicycle;
import Bicycle.MountainBike;
import Bicycle.RoadBike;


public class BasicService {
    public BasicService() {
    }

    public void accept(Bicycle bicycle){

            System.out.println("BS Fixing Bike.");

    }

    public void accept(MountainBike bicycle){

            System.out.println("BSFixing Mountain Bike.");

    }

    public void accept(RoadBike bicycle){
            System.out.println("BS Fixing Road Bike.");
    }





    //public abstract void accept(MountainBike bike);
}
