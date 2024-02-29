package tn.esprit.testtest.services;

import tn.esprit.testtest.entities.Event;
import tn.esprit.testtest.entities.Comment;


import java.util.List;

public interface EventServiceI {
    public List<Event> retrieveAllEvent();
    public Event retrieveEvent(Long eventId);
    public Event addEvent (Event e);
    public void removeEvent(Long eventId);
    public Event modifyEvent(Event event);


    Event getEventById(Long eventId);

    void addCommentToEvent(Long eventId, Comment comment);
    int getCommentCount(Long eventId);
    void updateCommentCount(Long eventId);
}
