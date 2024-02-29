package tn.esprit.testtest.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long CommentId;
    String text_comment;
    Date comment_date;
    long rating;
    int likes,dislikes;

    @ManyToOne
    Event event;

}