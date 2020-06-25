package Proyecto1;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEric {
    private double seconds = 0.0;
    private Timer timer; 

    public TimerEric(){
        timer = new Timer(); 
    }
    
    public void start(){
        TimerTask time = new TimerTask(){
        
            @Override
            public void run() {
                seconds = seconds + 0.1; 
            }
        };
        timer.schedule(time, 100, 100);
    }
    public void stop(){
        timer.cancel();
    }
    public void reset(){
        seconds = 0.0; 
    }
    public double get(){
        return seconds; 
    }
}