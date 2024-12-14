import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList <String> stringArrayList = new ArrayList<>();

        //Hinzufügen von Elemente
        stringArrayList.add("Hallo");
        stringArrayList.add("Hallo Max");
        stringArrayList.add("Mustermann");
        int size = stringArrayList.size(); //aktuelle Größe der Liste
        System.out.println("size = " + size);

        stringArrayList.add("Neues Element");
        size = stringArrayList.size();
        System.out.println("size = " + size);

        //Zugriff auf Elemente
        String firstElement = stringArrayList.get(0); //Zugriff auf das erste Element
        System.out.println(firstElement);
        String secoundElement = stringArrayList.get(1); //Zugriff auf das zweite Element
        System.out.println(secoundElement);

        for (int i = 0; i < stringArrayList.size(); i++) {
            String element = stringArrayList.get(i);
            System.out.println("element = " + element);
        }

        for (String element : stringArrayList) {
            System.out.println("element = " + element);
        }

        //Elemente entfernen
        stringArrayList.remove("Max");

    }

}
