package com.example.jpatest;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    public String toString(){
        return "id = "+id+", name = "+name;
    }

//    public int getId() {
//        return id;
//    }
}
