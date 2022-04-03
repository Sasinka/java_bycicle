package Bicycle;

public class Bicycle {
    protected int cadence;
    protected int speed;
    protected int gear;

    public Bicycle() {

    }

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    public void printDescription(){
        System.out.println("Bike is in gear "+getGear()+" with a cadence of "+getCadence()+" and traveling at a speed of "+getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
