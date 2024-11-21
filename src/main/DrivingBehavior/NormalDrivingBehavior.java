package DrivingBehavior;

import TrafficLight.TrafficColor;

public class NormalDrivingBehavior implements DrivingBehavior{
    @Override
    public void print(TrafficColor color) {
        if (color == TrafficColor.Red) {
            System.out.println("Stop");
        } else if (color == TrafficColor.Yellow) {
            System.out.println("Slow");
        } else if (color == TrafficColor.Green) {
            System.out.println("Go");
        }
    }
}
