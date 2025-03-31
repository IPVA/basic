package basic.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Loading data from database");
    }


    @Override
    public void remove() {
        System.out.println("Remove data from database");
    }

}
