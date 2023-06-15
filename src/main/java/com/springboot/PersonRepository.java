import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Collection<Person> findAll();
    Person findByUsername(String username);
    // Add additional methods here
}
