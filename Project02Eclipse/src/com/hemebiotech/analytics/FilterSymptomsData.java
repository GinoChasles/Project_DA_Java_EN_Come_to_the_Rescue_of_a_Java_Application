package com.hemebiotech.analytics;

import java.util.*;
import java.util.stream.Collectors;

public class FilterSymptomsData implements ISymptomsFilter{

    private List<String> symptoms;

    public FilterSymptomsData(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public List<String> FilterSymptoms() {

        List<String> result;
        Map<String, Integer> occurency = new HashMap<>();

        for (String symptom : symptoms) {
            if(occurency.containsKey(symptom)){
                occurency.put(symptom, occurency.get(symptom)+1);
            } else {
                occurency.put(symptom, 1);
            }
        }
        result = occurency.entrySet().stream().map(el -> el.getKey()+"= "+el.getValue()).collect(Collectors.toList());
        Collections.sort(result); //tri par ordre alphabétique
        return result;
    }
}
