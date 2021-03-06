/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.khaled.bsitter.dto;

import com.khaled.bsitter.dto.enums.Genre;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity(name = "Users")
@Table(name = "Users")
@Data
public class UsersDTO{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private AuthDTO auth; 
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date DateNaissance;
    private Genre genre;
    private String email;
    @ElementCollection
    private List<String> Telephones  = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private AdressDTO adress;
}
