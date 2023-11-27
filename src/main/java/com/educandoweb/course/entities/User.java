package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private static final long serializableVersionUID = 1L;
    
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

      // Construtor
      public User(Long id, String name, String email, String phone, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

     // Métodos Get
     public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    // Métodos Set
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

      // Método hashCode usando apenas o campo id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método equals usando apenas o campo id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User usuario = (User) obj;
        return Objects.equals(id, usuario.id);
    }
}
