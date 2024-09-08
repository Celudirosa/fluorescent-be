package com.fluorescent.users;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String surname;

    private String username;

    @Column(name = "date_birth")
    private LocalDate birthDate;

    private String email;

    private String password;

    private Rol rol;

}
