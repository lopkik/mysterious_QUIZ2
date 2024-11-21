import DrivingBehavior.DrivingBehavior;
import TrafficLight.TrafficColor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Motorcycle extends Vehicle implements PropertyChangeListener{
    private DrivingBehavior drivingBehavior;

    public Motorcycle(DrivingBehavior drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    public void setDrivingBehavior(DrivingBehavior drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Motorcycle");
        drivingBehavior.print((TrafficColor) evt.getNewValue());
    }
}
