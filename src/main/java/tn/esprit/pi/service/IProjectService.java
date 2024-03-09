package tn.esprit.pi.service;

import tn.esprit.pi.enitiy.Project;

import java.util.List;

public interface IProjectService {
  public List<Project> retiveAllProjects();
  public Project retriveProject (Long idProject);
   Project  addProject(Project p);
  public void removeProject(Long idProject);
  public Project modifyProject(Project project);
 // void approveProject(Long idProject);
 public Project validateProject(Long projectId);
}
