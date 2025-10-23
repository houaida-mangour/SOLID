package com.directi.training.dip.exercise_refactored;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReaderAdapter implements DataReader {
    private final String host;
    private final String path;

    public NetworkReaderAdapter(String host, String path) {
        this.host = host;
        this.path = path;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL("http", host, path);
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            StringBuilder content = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
            return content.toString();
        }
    }
}