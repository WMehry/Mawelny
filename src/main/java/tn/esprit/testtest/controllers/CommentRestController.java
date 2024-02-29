package tn.esprit.testtest.controllers;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testtest.entities.Comment;
import tn.esprit.testtest.services.CommentServiceI;
import tn.esprit.testtest.services.EventServiceI;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/comment")

public class CommentRestController {
    CommentServiceI commentService;
    EventServiceI eventService;

    @PostMapping("/{eventId}")
    public ResponseEntity<String> addCommentToEvent(
            @PathVariable Long eventId,
            @RequestBody Comment comment) {
        eventService.addCommentToEvent(eventId, comment);
        return ResponseEntity.ok("Comment added successfully.");
    }

    @GetMapping("/retrieve-all-comments")
    public List<Comment> getComments(){

        List<Comment> listComments =commentService.retrieveAllComment();
        return  listComments;
    }

    @GetMapping("/retrieve-comment/{Comment-Id}")
    public Comment retrieveComment(@PathVariable("Comment-Id") Long CommentId){
        Comment comment=commentService.retrieveComment(CommentId);
        return comment;
    }

    @PostMapping("/add-comment")
    public Comment addcomment(@RequestBody Comment c) {
        Comment comment = commentService.addComment(c);
        return comment;
    }

    @DeleteMapping("/remove-comment/{Comment-Id}")
    public void removecomment(@PathVariable("Comment-Id") Long CommentId) {

        commentService.removeComment(CommentId);
    }

    @PutMapping("/modify-comment")
    public Comment modifycomment(@RequestBody Comment c) {
        Comment comment = commentService.modifyComment(c);
        return comment;
    }

}
