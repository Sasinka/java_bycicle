package BicycleService;


import Bicycle.Bicycle;
import Bicycle.MountainBike;

public class MountainService extends BasicService {

    @Override
    public void accept(Bicycle bicycle){
        if(bicycle instanceof MountainBike){
            System.out.println("Fixing Mountain bike.");
        }else{
            System.out.println("Can't fix");
        }
    }
}
