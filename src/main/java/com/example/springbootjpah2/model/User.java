package com.example.springbootjpah2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class User{
    @Id
    private int id;
    private String name;
    private String profession;
    private int age;

}
