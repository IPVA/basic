package basic.javacore.Minterfaces.test;

import basic.javacore.Minterfaces.domain.DatabaseLoader;
import basic.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();
    }
}
