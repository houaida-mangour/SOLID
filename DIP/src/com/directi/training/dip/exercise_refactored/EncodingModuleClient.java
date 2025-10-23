package com.directi.training.dip.exercise_refactored;


import java.io.IOException;

import com.directi.training.dip.exercise.MyDatabase;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();

        // Scenario 1: File → File
        DataReader fileReader = new FileReaderAdapter(
            "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataWriter fileWriter = new FileWriterAdapter(
            "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode(fileReader, fileWriter);

        // Scenario 2: Network → File (previously Database)
        DataReader networkReader = new NetworkReaderAdapter("myfirstappwith.appspot.com", "/index.html");
        DataWriter dbWriter = new FileWriterAdapter(
            "DIP/src/com/directi/training/dip/exercise/networkOutput.txt");
        encodingModule.encode(networkReader, dbWriter);
    }
}