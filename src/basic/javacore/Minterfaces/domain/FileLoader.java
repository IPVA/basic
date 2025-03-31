package basic.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Loading data from file loader");
    }

    @Override
    public void remove(){
        System.out.println("remove data from file");
    }
}
