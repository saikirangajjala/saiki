package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Login {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
    private int number;

}
