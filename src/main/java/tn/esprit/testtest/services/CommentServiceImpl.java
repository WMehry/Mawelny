package tn.esprit.testtest.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testtest.entities.Comment;
import tn.esprit.testtest.repositories.CommentRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class CommentServiceImpl implements CommentServiceI{
CommentRepository commentRepository;
    @Override
    public List<Comment> retrieveAllComment() {

        return commentRepository.findAll();
    }

    @Override
    public Comment retrieveComment(Long CommentID) {
        return commentRepository.findById(CommentID).get();
    }

    @Override
    public Comment addComment(Comment c) {

        return commentRepository.save(c);
    }

    @Override
    public void removeComment(Long CommentId) {
        commentRepository.deleteById(CommentId);

    }

    @Override
    public Comment modifyComment(Comment comment) {
        return commentRepository.save(comment);
    }


    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

}
