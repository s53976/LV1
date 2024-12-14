package org.campus02.arrays;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer {
    private HashMap<String, Integer> result = new HashMap<>();

    public CountryAnalyzer(HashMap<String, Integer> result) {
        this.result = result;
    }

    @Override
    public void analyze() {

    }

    public HashMap<String, Integer> getResult() {
        return result;
    }
}
