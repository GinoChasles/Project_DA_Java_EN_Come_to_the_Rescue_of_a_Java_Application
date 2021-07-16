package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class FilterSymptomsData implements ISymptomsFilter{

    private List<String> symptoms;

    public FilterSymptomsData(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public List<String> FilterSymptoms() {

        ArrayList<String> result = new ArrayList<String>();



        return result;
    }
}
