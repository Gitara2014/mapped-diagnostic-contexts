package com.bane.mdc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Employee {

    private Long id;
    private String name;
    private int age;

    public String toString() {
        return "Employee(id=" + this.getId() + ", name=" + this.getName() + ", age=" + this.getAge() + ")";
    }
}
