package tn.esprit.testtest.controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testtest.entities.Event;
import tn.esprit.testtest.services.EventServiceI;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/event")

public class EventRestController {
    EventServiceI eventService;


    @GetMapping("/retrieve-all-events")
    public List<Event> getEvents(){

        List<Event> listEvents =eventService.retrieveAllEvent();
        return  listEvents;
    }

    @GetMapping("/retrieve-event/{Event-Id}")
    public Event retrieveEvent(@PathVariable("Event-Id") Long EventId){
        Event event=eventService.retrieveEvent(EventId);
        return event;
    }

    @PostMapping("/add-event")
    public Event addevent(@RequestBody Event e) {
        Event event = eventService.addEvent(e);
        return event;
    }

    @DeleteMapping("/remove-event/{Event-Id}")
    public void removeevent(@PathVariable("Event-Id") Long EventId) {

        eventService.removeEvent(EventId);
    }

    @PutMapping("/modify-event")
    public Event modifyevent(@RequestBody Event e) {
        Event event = eventService.modifyEvent(e);
        return event;
    }

}
