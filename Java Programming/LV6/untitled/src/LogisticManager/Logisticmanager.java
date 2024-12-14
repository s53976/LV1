package LogisticManager;

import java.util.ArrayList;

public class Logisticmanager {

    private ArrayList<Moveable> moveables = new ArrayList<>();


    public void addMoveable (Moveable m) {
        moveables.add(m);
    }

    public void moveAll(String destination) {
        for (Moveable moveable : moveables) {
            moveable.move(destination);
        }
    }

}
