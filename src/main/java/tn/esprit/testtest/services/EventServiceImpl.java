package tn.esprit.testtest.services;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testtest.entities.Event;
import tn.esprit.testtest.entities.Comment;
import tn.esprit.testtest.repositories.EventRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class EventServiceImpl implements EventServiceI{
EventRepository eventRepository;
    CommentServiceI commentService;
    @Override
    public List<Event> retrieveAllEvent() {

        return eventRepository.findAll();
    }

    @Override
    public Event retrieveEvent(Long EventID) {
        return eventRepository.findById(EventID).get();
    }

    @Override
    public Event addEvent(Event e) {

        return eventRepository.save(e);
    }

    @Override
    public void removeEvent(Long EventId) {
        eventRepository.deleteById(EventId);

    }

    @Override
    public Event modifyEvent(Event event) {
        return eventRepository.save(event);
    }


    @Override
    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }

    @Override
    public void addCommentToEvent(Long eventId, Comment comment) {
        Event event = getEventById(eventId);

        if (event != null) {
            comment.setEvent(event);
            commentService.saveComment(comment);
        } else {
            throw new EntityNotFoundException("Event with ID " + eventId + " not found.");
        }
    }


    @Override
    public int getCommentCount(Long eventId) {
        Event event = getEventById(eventId);
        if (event != null) {
            return event.getCommentCount();
        } else {
            throw new EntityNotFoundException("Event with ID " + eventId + " not found.");
        }
    }

    @Override
    public void updateCommentCount(Long eventId) {
        Event event = getEventById(eventId);
        if (event != null) {
            event.setCommentCount(event.getComments().size());
            eventRepository.save(event);
        } else {
            throw new EntityNotFoundException("Event with ID " + eventId + " not found.");
        }
    }

}
