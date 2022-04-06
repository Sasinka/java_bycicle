package Car;

import Bicycle.Bicycle;
import Bicycle.MountainBike;
import Bicycle.RoadBike;

import Holder.BicycleHolder;
import Holder.RoadBikeHolder;
import Holder.MountainBikeHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Car {
    private List<BicycleHolder> carHolders;
    private List<MountainBikeHolder> carMountainHolders;
    private List<RoadBikeHolder> carRoadHolders;

    public Car(){
        this.carHolders = Collections.emptyList();
        this.carRoadHolders = Collections.emptyList();
        this.carMountainHolders = Collections.emptyList();
    }

    public interface BicycleVisitable {
        public void accept(Bicycle b);
        public void accept(MountainBike b);
        public void accept(RoadBike b);
    }


    public void accept (Bicycle bike){
        List<BicycleHolder> carHolders = new ArrayList<BicycleHolder>(4);
        BicycleHolder bh = new BicycleHolder(bike);
        carHolders.add(bh);
    }


    public void accept (MountainBike bike){
        List<MountainBikeHolder> carHolders = new ArrayList<MountainBikeHolder>(4);
        MountainBikeHolder mbh = new MountainBikeHolder(bike);
        carMountainHolders.add(mbh);
    }

    public void accept (RoadBike bike){
        List<RoadBikeHolder> carHolders = new ArrayList<RoadBikeHolder>(4);
        RoadBikeHolder rbh = new RoadBikeHolder(bike);
        carRoadHolders.add(rbh);
    }

}
