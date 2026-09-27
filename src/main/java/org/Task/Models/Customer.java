package org.Task.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("customer_type")
public class Customer extends Person{
    private String address;
    private String phone;

    public Customer( String name, String address, String phone) {
        super( name);
        this.address = address;
        this.phone = phone;
    }
    public Customer() {
        super();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
