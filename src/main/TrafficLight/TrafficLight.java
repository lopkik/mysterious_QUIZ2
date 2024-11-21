package TrafficLight;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Timer;
import java.util.TimerTask;

public class TrafficLight  {
    private TrafficColor currentTrafficColor;
    private int timeRemainingInSeconds;
    private Timer timer;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private TimerTask changeColor = new TimerTask() {
        @Override
        public void run() {
            TrafficColor oldTrafficColor = currentTrafficColor;
            if (currentTrafficColor == TrafficColor.Red) {
                currentTrafficColor = TrafficColor.Green;
            } else if (currentTrafficColor == TrafficColor.Yellow) {
                currentTrafficColor = TrafficColor.Red;
            } else if (currentTrafficColor == TrafficColor.Green) {
                currentTrafficColor = TrafficColor.Yellow;
            }
            support.firePropertyChange("color", oldTrafficColor, currentTrafficColor);
            timeRemainingInSeconds = (int)(Math.random() * 10);
            timer.schedule(this, timeRemainingInSeconds * 1000);
        }
    };

    public TrafficLight() {
        currentTrafficColor = TrafficColor.Red;
        timeRemainingInSeconds = (int)(Math.random() * 10);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void startTimer() {
        timer.schedule(changeColor, timeRemainingInSeconds * 1000);
    }
}
