package pedro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pedro.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
