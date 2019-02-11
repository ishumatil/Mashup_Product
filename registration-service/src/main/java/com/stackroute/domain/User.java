package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private int age;
    private String gender;
    private String company;
    private String course;
    private String firstName;
    private String lastName;
    private String interest;
    private String discipline;
    @Id
    private String id;
    private String emailId;
    private String college;
//    private String token;
}
