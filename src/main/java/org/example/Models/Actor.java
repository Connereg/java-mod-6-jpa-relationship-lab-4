
package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ACTOR_TABLE")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "actor")
    private List<Character> characterList = new ArrayList<>();

}