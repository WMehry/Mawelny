package tn.esprit.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pi.enitiy.Project;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long> {
}
