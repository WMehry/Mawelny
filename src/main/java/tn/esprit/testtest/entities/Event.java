package tn.esprit.testtest.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long EventId;
    String title,description;
    Date date;
    int nbrParticipants,likes,dislikes;
    Float budget,balance;

    @OneToMany(mappedBy = "event")
    List<Comment> comments = new ArrayList<>();

    int commentCount;


}