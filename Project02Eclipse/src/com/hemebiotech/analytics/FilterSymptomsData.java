package com.hemebiotech.analytics;

import java.util.*;
import java.util.stream.Collectors;


public class FilterSymptomsData implements ISymptomsFilter{

    private List<String> symptoms;

    public FilterSymptomsData(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    /**
     * @return a list of Strings from which their multiple
     * occurances are deleted but their numbers counted.
     * We opt this list with the use of a hashmap to retrieve
     * the key of each element of the list.
     * The list is then sorted alphabetically.
     */
    @Override
    public List<String> filterSymptoms() {

        List<String> result;
        Map<String, Integer> oneness = new HashMap<>();

        for (String symptom : symptoms) {
            if(oneness.containsKey(symptom)){
                oneness.put(symptom, oneness.get(symptom)+1);
            } else {
                oneness.put(symptom, 1);
            }
        }
        result = oneness.entrySet().stream().map(el -> el.getKey()+"= "+el.getValue()).collect(Collectors.toList());

        Collections.sort(result); //alphabetic order
        return result;
    }
}
