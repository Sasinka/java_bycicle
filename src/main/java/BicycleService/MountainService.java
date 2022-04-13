package BicycleService;


import Bicycle.Bicycle;
import Bicycle.MountainBike;
import Bicycle.RoadBike;

public class MountainService extends BasicService {

    @Override
    public void accept(Bicycle bicycle){

            System.out.println("MS Fixing  bike.");

    }

    public void accept(MountainBike bicycle){

            System.out.println(" MS Fixing Mountain bike.");

    }

    public void accept(RoadBike bicycle){

            System.out.println("MS Fixing Road bike.");

    }
}
