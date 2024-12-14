package PegelVerwaltung;

import EventKalender.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WasserstandManager {

    ArrayList<Wasserstand> wasserstands = new ArrayList<>();



    public void add (Wasserstand wasserstand) {
        wasserstands.add(wasserstand);
    }


    public Wasserstand findById (int id) {
        for (Wasserstand wasserstand : wasserstands) {
               if (wasserstand.getId() == id) {
                   return wasserstand;
               }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser (String gewaesserName) {
        ArrayList<Wasserstand> result = new ArrayList<>();
        for (Wasserstand wasserstand : result) {
            if (wasserstand.getGewaesserName().equals(gewaesserName)) {
                result.add(wasserstand);
            }

        }
        return result;
    }

    public Wasserstand findLastWasserstand (String gewaesserName) {
        double maxValue = Double.MIN_VALUE;
        Wasserstand max = null;
        for (Wasserstand wasserstand : wasserstands) {
            if(wasserstand.getGewaesserName().equals(gewaesserName)){
                if (wasserstand.getZeitpunkt() > maxValue) {
                    maxValue = wasserstand.getZeitpunkt();
                    max = wasserstand;
                }
            }
        }
        return max;

    }

    public ArrayList<Wasserstand> findForAlamierung () {
        ArrayList<Wasserstand> result = new ArrayList<>();
        for (Wasserstand wasserstand : wasserstands) {
            if (wasserstand.getMessWert() >= wasserstand.getMessWertFuerAlamierung()) {
                result.add(wasserstand);
            }
        }
        return result;
    }

    public double calcMittlererWasserstand (String gewaesserName, String ort) {
        double sum = 0;
        int count = 0;

        for (Wasserstand wasserstand : wasserstands) {
            if(wasserstand.getGewaesserName().equals(gewaesserName) ){
                sum += wasserstand.getMessWert();
                count++;
            }
        }
    return sum/count;
    }

    public ArrayList<Wasserstand> findByZeitpunkt (int von, int bis, String gewaesserName, String ort) {
        ArrayList<Wasserstand> result = new ArrayList<>();
        for (Wasserstand wasserstand : wasserstands) {
            if (wasserstand.getZeitpunkt() >= von && wasserstand.getZeitpunkt() <= bis && wasserstand.getGewaesserName().equals(wasserstand) ) {
                result.add(wasserstand);
            }
        }
        return result;
    }

    public HashMap <String, Integer> countOfWasserstandPerGewaesser() {
        HashMap<String, Integer> result = new HashMap<>();
        for (Wasserstand wasserstand : wasserstands) {
            if (result.get(wasserstand.getGewaesserName()) == null) {
                result.put(wasserstand.getGewaesserName(), 1);
            }else {
                result.put(wasserstand.getGewaesserName(), result.get(wasserstand.getGewaesserName()) + 1);

            }
        }
    return result;
    }

    public HashSet<String> getUniqueGewaesserName() {
        HashSet <String> result = new HashSet<>();
        for (Wasserstand wasserstand : wasserstands) {
            result.add(wasserstand.getGewaesserName());
        }
        return result;
    }

    public void printCountOfWasserstandPerGewaesser (HashMap<String, Integer>countPerGewaesser){
        for (Map.Entry<String, Integer> stringIntegerEntry : countPerGewaesser.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
    }



}
