package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 * Implementation to write the result in a file result.out
 */
public class WriteSymptomDataToANewFile implements ISymptomWriter {

    private List<String> symptoms;

    /**
     * @param symptoms a list of lines to save in a file.
     */
    public WriteSymptomDataToANewFile(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public void WriteFile() throws IOException {

        Files.write(Paths.get("result.out"), symptoms);


        /**
         *
         * The first logic used and optimized from the source code
         */
//        if (symptoms != null) {
//            try {
//        BufferedWriter fileOut = new BufferedWriter(new FileWriter("Project02Eclipse/result.out"));
        /**
         * @param fileOut a file to create in the package Projet02Eclipse
         * */

//        for (String symptom : symptoms) {
//            fileOut.write(symptom);
//            fileOut.newLine();
//        }
//
//        fileOut.close();
//    } catch(
//    IOException e)
//
//    {
//        e.printStackTrace();
    }
}
