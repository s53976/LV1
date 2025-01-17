import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    private ArrayList<Figure> Figuren = new ArrayList<>();


    public void add (Figure f) {
        Figuren.add(f);
    }

    public double getMaxPerimeter() {
        double MaxValue = Double.MIN_VALUE;

        for (Figure figure : Figuren) {
            if (figure.getPerimeter() >= MaxValue) {
                MaxValue = figure.getPerimeter();
            }
        }
        return MaxValue;
    }

    public double getAverageAreaSize() {
        double cout = 0;
        double sum = 0;

        for (Figure figure : Figuren) {
            sum += figure.getArea();
            cout++;
        }
        return sum/cout;
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> result = new HashMap<>();
        result.put("Klein", 0.0);
        result.put("Mittel", 0.0);
        result.put("Groß" , 0.0);

        for (Figure figure : Figuren) {
            double area = figure.getArea();
            if (area < 1000) {
                result.put("Klein", result.get("Klein")+ area);
            }else if (area >= 1000 && area<5000) {
                result.put("Mittel", result.get("Mittel")+ area);
            }else {
                result.put("Groß", result.get("Groß")+area);
            }
        }
return result;
        
    }
}
