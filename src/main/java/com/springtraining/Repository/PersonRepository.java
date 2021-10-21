package com.springtraining.Repository;

import com.springtraining.entity.Persone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Persone, Long>, JpaSpecificationExecutor<Persone> {

    @Query("select p from Persone p where p.name = ?1")
    Persone findByName (String name);

}
