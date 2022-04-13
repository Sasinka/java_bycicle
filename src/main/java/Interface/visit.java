package Interface;

import Bicycle.*;
import BicycleService.*;

public interface visit {
    abstract public void visit();
    abstract public void visit(Bicycle bike);
    abstract public void visit (RoadBike bike);
    abstract public void visit(MountainBike bike);

    abstract public void visit(BasicService bs);
    abstract public void visit(MountainService bs);
    abstract public void visit(RoadBikeService bs);
}
