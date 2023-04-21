package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Cat {

    private String name;

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
