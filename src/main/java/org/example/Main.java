package org.example;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("abc");
        p.setId(1);

        p.getName();
        p.getId();

        Person p1 = Person.builder().id(1).name("abc").build();
    }
}