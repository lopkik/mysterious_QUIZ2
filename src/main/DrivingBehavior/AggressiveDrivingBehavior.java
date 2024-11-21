package DrivingBehavior;

import TrafficLight.TrafficColor;

public class AggressiveDrivingBehavior implements DrivingBehavior {
    @Override
    public void print(TrafficColor color) {
        if (color == TrafficColor.Red) {
            System.out.println("Slam brakes");
        } else if (color == TrafficColor.Yellow) {
            System.out.println("Faster");
        } else if (color == TrafficColor.Green) {
            System.out.println("Need4Speed");
        }
    }
}
