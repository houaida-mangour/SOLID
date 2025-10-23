package com.directi.training.dip.exercise_refactored;


import java.io.IOException;
import java.util.Base64;

public class EncodingModule {

    public void encode(DataReader reader, DataWriter writer) throws IOException {
        String input = reader.read();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        writer.write(encoded);
    }
}