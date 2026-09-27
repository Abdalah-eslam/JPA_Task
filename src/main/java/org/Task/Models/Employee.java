package org.Task.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("employee_type")
public class Employee extends Person {
    private String position;
    private double salary;

    public Employee( String name ,String position,double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
