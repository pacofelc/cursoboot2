package com.cuatro.cursoboot.model;

import javax.persistence.*;

public class ContactModel {
  private int id;
  private String city;
  private String firstName;
  private String lastName;
  private String telephone;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public ContactModel(int id,String city, String firstName, String lastName, String telephone) {
    this.id= id;
    this.city = city;
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  public ContactModel() {
  }

  @Override
  public String toString() {
    return "ContactModel{" +
            "id=" + id +
            ", city='" + city + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", telephone='" + telephone + '\'' +
            '}';
  }
}

