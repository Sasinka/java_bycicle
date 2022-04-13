import Bicycle.Bicycle;
import Bicycle.MountainBike;
import Bicycle.RoadBike;

import BicycleService.BasicService;
import BicycleService.MountainService;
import BicycleService.RoadBikeService;

import Car.Car;

import java.security.Provider;

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

      /*  service.accept(bike01);
        service.accept(bike02);
        service.accept(bike03);

        service1.accept(bike01);
        service1.accept(bike02);
        service1.accept(bike03);

        service2.accept(bike01);
        service2.accept(bike02);
        service2.accept(bike03);
*/
        bike01.visit(service);
        bike01.visit(service1);
        bike01.visit(service2);

        bike02.visit(service);
        bike02.visit(service1);
        bike02.visit(service2);

        bike03.visit(service);
        bike03.visit(service1);
        bike03.visit(service2);

        System.out.println("Single dispatch:");
        Car car1 = new Car();
        car1.accept(bike01);
        car1.accept(bike02);
        car1.accept(bike03);
        System.out.println(car1); //???
/*
        System.out.println("Double dispatch:");
        Car car2 = new Car();
        bike01.Interface.visit(car2);
        bike02.Interface.visit(car2);
        bike03.Interface.visit(car2);
        System.out.println(car2);
*/

    }

}
