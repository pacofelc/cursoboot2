package com.cuatro.cursoboot.entity;

import javax.persistence.*;

@Entity
@Table( name = "contact", schema = "contacts")
public class Contact {

  @Id
  @GeneratedValue
  @Column(name="id")
  private int id;
  @Column(name="city")
  private String city;
  @Column(name="first_name")
  private String firstName;
  @Column(name="last_name")
  private String lastName;
  @Column(name="telephone")
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

  public Contact(int id,String city, String firstName, String lastName, String telephone) {
    this.id= id;
    this.city = city;
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  public Contact() {
  }

}
