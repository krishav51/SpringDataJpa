package io.risx0707.springbootsql.Repository;

import io.risx0707.springbootsql.Entity.student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends CrudRepository<student, Integer> {

}
