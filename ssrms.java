package com.example.indiaskills;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

import javax.annotation.processing.Generated;
import javax.management.relation.Role;

public class ssrms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    public String Name;
    public String email;
    private String password;
    public String role;

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email = Email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
}
