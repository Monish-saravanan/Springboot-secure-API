public interface PersonService {
    Collection<Person> getAllPeople();
    Person getPersonById(long id);
    Person createPerson(Person person);
    void deletePerson(long id);
}

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepo;

    public PersonServiceImpl(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public Collection<Person> getAllPeople() {
        return personRepo.findAll();
    }

    @Override
    public Person getPersonById(long id) {
        return personRepo.findById(id).orElse(null);
    }

    @Override
    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public void deletePerson(long id) {
        personRepo.deleteById(id);
    }
}
