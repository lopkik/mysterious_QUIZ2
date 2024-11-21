package DrivingBehavior;

import TrafficLight.TrafficColor;

public class PassiveDrivingBehavior implements DrivingBehavior{
    @Override
    public void print(TrafficColor color) {
        if (color == TrafficColor.Red) {
            System.out.println("Stop");
        } else if (color == TrafficColor.Yellow) {
            System.out.println("Slower");
        } else if (color == TrafficColor.Green) {
            System.out.println("Go Slow");
        }
    }
}
