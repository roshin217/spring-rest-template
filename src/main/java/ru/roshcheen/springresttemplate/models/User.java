package ru.roshcheen.springresttemplate.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Long id;

    private String name;

    private String lastName;

    private Byte age;

}
