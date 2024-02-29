package tn.esprit.testtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testtest.entities.Event;

@Repository

public interface EventRepository extends JpaRepository<Event,Long> {
}
