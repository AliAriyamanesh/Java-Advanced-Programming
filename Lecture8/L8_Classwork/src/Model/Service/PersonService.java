package Model.Service;

import Model.Entity.PersonEntity;
import Model.Repository.PersonRepository;

public class PersonService {
    private static PersonService instance = new PersonService();
    private PersonService() {}
    public static PersonService getInstance() {
        return instance;
    }
    public void save (PersonEntity personEnti) throws Exception {
        try (PersonRepository personRepo = new PersonRepository ()) {
            personRepo.insert (personEnti);
            personRepo.commit ();
        }
    }
    public boolean Exists (String username , String password) throws Exception {
        PersonRepository repo = new PersonRepository();
        if (repo.Login(username,password)){
            return true;
        }
        return false;
    }

}
