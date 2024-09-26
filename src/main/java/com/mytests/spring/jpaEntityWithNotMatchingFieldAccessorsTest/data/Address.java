package com.mytests.spring.jpaEntityWithNotMatchingFieldAccessorsTest.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    private Integer id;
    private String street;
    private String city;
    private String zip;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Address() {}

    public void setId(Integer id) {
        this.id = id;
    }

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
               "id=" + id +
               ", street='" + street + '\'' +
               ", city='" + city + '\'' +
               ", zip='" + zip + '\'' +
               '}';
    }
}
