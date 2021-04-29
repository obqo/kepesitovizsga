package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Empty parameter!");
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            for (String key: contacts.keySet()) {
                writer.write(key + ": " + contacts.get(key) + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!");
        }
    }
}
