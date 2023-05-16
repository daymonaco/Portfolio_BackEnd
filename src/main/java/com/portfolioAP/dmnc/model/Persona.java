package com.portfolioAP.dmnc.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table(name="persona")
@Entity
public class Persona implements Serializable {
    
    
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column
    @NotNull
    @Size(min=1, max=50)
    private String name;
    
    @Column
    @NotNull
    @Size(min=1, max=50)
    private String lastName;
    
    @Column
    @NotNull
    private String img;
    
    @Column
    @NotNull
    @Size(min=1, max=50)
    private String city;
    
    @Column
    @NotNull
    @Size(min=1, max=70)
    private String profile;
    
    @Column
    @NotNull
    @Size(min=1, max=250)
    private String aboutMe;
    
    @Column
    @NotNull
    @Size(min=1, max=30)
    private String phoneNumber;
    
    @Column
    @NotNull
    @Size(min=1, max=50)
    private String email;


public Persona() {

    }

 public Persona(Long id, String name, String lastName, String img, String city,
            String profile, String aboutMe, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.img = img;
        this.city = city;
        this.profile = profile;
        this.aboutMe = aboutMe;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}