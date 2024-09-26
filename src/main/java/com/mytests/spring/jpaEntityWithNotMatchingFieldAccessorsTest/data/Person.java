package com.mytests.spring.jpaEntityWithNotMatchingFieldAccessorsTest.data;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    private Integer _id;
    private String _name;
    private String _surname;
    private Address _address;

    @Id @GeneratedValue
    public Integer getId() {
        return _id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "address_id")
    public Address getAddress() {
        return _address;
    }

    @Column(name = "firstname")
    public String getName() {
        return _name;
    }

    @Column(name = "lastname")
    public String getSurname() {
        return _surname;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setSurname(String surname) {
        this._surname = surname;
    }

    public void setAddress(Address _address) {
        this._address = _address;
    }

    public Person(String _name, String _surname, Address _address) {
        this._name = _name;
        this._surname = _surname;
        this._address = _address;
    }

    public Person() {

    }


    @Override
    public String toString() {
        return "Person{" +
               "id=" + _id +
               ", name='" + _name + '\'' +
               ", surname='" + _surname + '\'' +
               ", address=" + _address +
               '}';
    }
}
