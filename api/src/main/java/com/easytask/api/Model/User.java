package com.easytask.api.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name ="USERS")
public class User extends AEntity{


    @NotNull
    @Column(name ="FIRSTNAME", nullable = false)
    private String firstname;


    @NotNull
    @Column(name = "LASTNAME", nullable = false)
    private String lastname;


    @NotNull
    @Column(name = "EMAIL", nullable = false)
    private String email;


    @NotNull
    @Column(name = "PASSWORD", nullable = false)
    private String password;  
}
