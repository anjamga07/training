package com.springtraining.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Persone {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private int age;

    public Persone(){}

    public Persone(Long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
