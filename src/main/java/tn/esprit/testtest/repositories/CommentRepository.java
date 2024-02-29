package tn.esprit.testtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testtest.entities.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
