package EventKalender;

import javax.xml.transform.Result;
import java.util.ArrayList;

public class EventKalender {

    ArrayList<Event> events = new ArrayList<>();


    public void add (Event event ) {
        events.add(event);
    }


    public Event getByTitle (String title) {
        for (Event event : events) {
            if (event.getTitel().equals(title)) {
                return event;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt (String ort) {
        ArrayList<Event> Result = new ArrayList<>();
        for (Event event : events) {
            if (event.getOrt().equals(ort)) {
                Result.add(event);
            }
        }
        return Result;
    }
    public ArrayList<Event> getByEintrittsPreis (double min, double max){
        ArrayList<Event>mostExpensive = new ArrayList<>();
        for (Event event : events) {
            if(event.getEintrittspreis()>= min && event.getEintrittspreis() <= max) {
                mostExpensive.add(event);
            }

        }
        return mostExpensive;
    }


    public Event getMostExpensiveByOrt (String ort) {
        double maxValue = Double.MIN_VALUE;

        Event max = null;
       // max.setEintrittspreis(Double.MIN_VALUE);
        for (Event event : events) {
            if(event.getOrt().equals(ort)){
                if (event.getEintrittspreis() > maxValue) {
                    maxValue = event.getEintrittspreis();
                    max = event;
                }
            }

        }
        return max;
    }

    public double getAvgPreisByOrt (String ort) {
        double sum = 0;
        double count = 0;

        for (Event event : events) {
            if(event.getOrt().equals(ort)) {
                sum += event.getEintrittspreis();
                count++;
            }

        }
        return sum/count;
    }






}
