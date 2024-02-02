package org.campus02.irmler;

import java.util.ArrayList;
import java.util.HashMap;

public class Notenverteilung {

    HashMap notenProStudenten = new HashMap<>();

    public Notenverteilung () {

    }

    public boolean addStudent(String name) {
        if (notenProStudenten.containsKey(name));
        return true;
    }
}
