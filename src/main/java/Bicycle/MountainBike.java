package Bicycle;

public class MountainBike {
    private String suspension;

    public MountainBike(String suspension) {
        this.suspension = suspension;
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
