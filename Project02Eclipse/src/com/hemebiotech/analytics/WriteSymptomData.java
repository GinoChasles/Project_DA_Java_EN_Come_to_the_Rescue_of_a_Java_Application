package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteSymptomData implements ISymptomWriter {

    private List<String> symptoms;

    public WriteSymptomData(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public void WriteFile() throws IOException {

        Files.write(Paths.get("resultOut.out"), symptoms);
//        if (symptoms != null) {
//            try {
//                BufferedWriter fileOut = new BufferedWriter(new FileWriter("Project02Eclipse/resultOut.txt"));
//                for (String symptom : symptoms) {
//                    fileOut.write(symptom);
//                    fileOut.newLine();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
