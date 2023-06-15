import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {
    
    // ...

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable long id, Principal principal) {
        Person currentPerson = personRepo.findByUsername(principal.getName());

        if (currentPerson != null && currentPerson.getId() == id) {
            personRepo.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
    
    // ...
}
