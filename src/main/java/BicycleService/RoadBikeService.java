package BicycleService;

import Bicycle.Bicycle;
import Bicycle.RoadBike;

public class RoadBikeService extends BasicService {

    @Override
    public void accept(Bicycle bike){
        if(bike instanceof RoadBike) {
            System.out.println("Fixing Road bike.");
        }else{
            System.out.println("Can't fix");
        }
    }
}
