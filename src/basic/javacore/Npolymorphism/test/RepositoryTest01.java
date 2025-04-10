package basic.javacore.Npolymorphism.test;

import basic.javacore.Npolymorphism.repository.Repository;
import basic.javacore.Npolymorphism.service.DatabaseRepositoryService;
import basic.javacore.Npolymorphism.service.FileRepositoryService;
import basic.javacore.Npolymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    public static void main(String[] args) {
        DatabaseRepositoryService dbService = new DatabaseRepositoryService();
        dbService.save();

        Repository repository1 = new DatabaseRepositoryService();
        Repository repository2 = new InMemoryRepositoryService();
        Repository repository3 = new FileRepositoryService();
        repository1.save();
        repository2.save();
        repository3.save();
    }
}
