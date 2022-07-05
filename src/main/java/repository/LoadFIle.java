package repository;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface LoadFIle {
    default void readFile() throws FileNotFoundException {};

    default void writeFile() throws IOException {};
}
