/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

public Client(){

}
public void setId(Long id){
    this.id=id;
}
public Long getId(){
    return id;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setEmail(String email){
    this.email=email;
}
public String getEmail(){
    return email;
}
}
