package com.example.jpatest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
     Person findByName(String name);

     Person findById(int id);

     @Override
     <S extends Person> S save(S entity);
}
