package pl.wsei.lublin.apptesting.testingweb5;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("SELECT person from Person person WHERE person.companyName = :companyName")
    List<Person> findByCompany(@Param("companyName") String companyName);

}

