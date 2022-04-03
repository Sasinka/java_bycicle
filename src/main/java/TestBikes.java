import Bicycle.Bicycle;
import Bicycle.MountainBike;
import Bicycle.RoadBike;

import BicycleService.BasicService;
import BicycleService.MountainService;
import BicycleService.RoadBikeService;


public class TestBikes {
    public static void main(String[] args){
        //proč tohle nefungovalo?
        //Bicycle getBike01, bike02, bike03;

        // bike01 = new Bicycle(20, 10, 1);

        Bicycle bike01 = new Bicycle(20, 10, 1);
        Bicycle bike02 = new MountainBike(20, 10, 5, "Dual");
        Bicycle bike03 = new RoadBike(40, 20, 8, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();

        BasicService service = new BasicService();
        MountainService service1 = new MountainService();
        RoadBikeService service2 = new RoadBikeService();

        service.accept(bike01);
        service.accept(bike02);
        service.accept(bike03);

        service1.accept(bike01);
        service1.accept(bike02);
        service1.accept(bike03);

        service2.accept(bike01);
        service2.accept(bike02);
        service2.accept(bike03);
    }

}
