package basic.javacore.Npolymorphism.service;

import basic.javacore.Npolymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in the memory");
    }
}
