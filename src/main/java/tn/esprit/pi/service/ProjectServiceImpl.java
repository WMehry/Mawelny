package tn.esprit.pi.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pi.enitiy.Project;
import tn.esprit.pi.repository.ProjectRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjectServiceImpl implements  IProjectService{
ProjectRepository projectRepository;
  public List<Project> retiveAllProjects() {
    return projectRepository.findAll();
  }


  public Project retriveProject(Long idProject) {
    return projectRepository.findById(idProject).get();
  }


  public Project addProject(Project p) {
    return projectRepository.save(p);
  }


  public void removeProject(Long idProject) {
    projectRepository.deleteById(idProject);
  }


  public Project modifyProject(Project project) {
    return projectRepository.save(project);
  }

  public Project validateProject(Long projectId) {
    Project project = projectRepository.findById(projectId)
      .orElseThrow(() -> new EntityNotFoundException("Project not found"));

    return projectRepository.save(project);
  }


}
