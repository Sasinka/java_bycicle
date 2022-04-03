package Bicycle;

public class MountainBike extends Bicycle{
    private String suspension;

    public MountainBike(String suspension) {
        this.suspension = suspension;
    }

    public MountainBike(int cadence, int speed, int gear, String suspension) {
        super(cadence, speed, gear);
        this.suspension = suspension;
    }

    @Override
    public void printDescription(){
        System.out.println("Bike is in gear "+getGear()+" with a cadence of "+getCadence()+" and traveling at a speed of "+getSpeed()+" it's susspention is "+getSuspension());
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        if (suspension == "Front" || suspension == "Dual") {
            this.suspension = suspension;
        }
    }
}
