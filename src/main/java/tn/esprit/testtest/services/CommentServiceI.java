package tn.esprit.testtest.services;

import tn.esprit.testtest.entities.Comment;

import java.util.List;

public interface CommentServiceI {
    public List<Comment> retrieveAllComment();
    public Comment retrieveComment(Long commentId);
    public Comment addComment (Comment c);
    public void removeComment(Long commentId);
    public Comment modifyComment(Comment comment);

    void saveComment(Comment comment);
}
