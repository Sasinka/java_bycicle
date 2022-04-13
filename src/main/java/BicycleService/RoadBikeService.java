package BicycleService;

import Bicycle.Bicycle;
import Bicycle.RoadBike;
import Bicycle.MountainBike;

public class RoadBikeService extends BasicService {

    @Override
    public void accept(Bicycle bike){

            System.out.println("Fixing bike.");

    }

    public void accept(MountainBike bike){

            System.out.println("Fixing Mountain Bike.");

    }


    public void accept(RoadBike bike){

            System.out.println("Fixing Road bike.");

    }




}
