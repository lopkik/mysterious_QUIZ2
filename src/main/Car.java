import DrivingBehavior.DrivingBehavior;
import TrafficLight.TrafficColor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car extends Vehicle implements PropertyChangeListener{
    private DrivingBehavior drivingBehavior;

    public Car(DrivingBehavior drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    public void setDrivingBehavior(DrivingBehavior drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Car");
        drivingBehavior.print((TrafficColor) evt.getNewValue());
    }
}
