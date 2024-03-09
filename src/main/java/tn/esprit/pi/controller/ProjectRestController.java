package tn.esprit.pi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pi.enitiy.Project;
import tn.esprit.pi.service.IProjectService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/project")
public class ProjectRestController {
  IProjectService projectService;
  // http://localhost:8089/pi/project/retrieve-all-projects
  @GetMapping("/retrieve-all-projects")
  public List<Project> getProjects() {
    List<Project> listProjects = projectService.retiveAllProjects();
    return listProjects;
  }
  // http://localhost:8089/pi/project/retrieve-project/8
  @GetMapping("/retrieve-project/{project-id}")
  public Project retrieveProject(@PathVariable("project-id") Long projectId) {
    Project project = projectService.retriveProject(projectId);
    return project;}
  // http://localhost:8089/pi/project/add-project
  @PostMapping("/add-project")
  public Project addProject(@RequestBody Project p) {
    Project project = projectService.addProject(p);
    return project;
  }
  // http://localhost:8089/pi/project/remove-project/{project-id}
  @DeleteMapping("/remove-project/{project-id}")
  public void removeProject(@PathVariable("project-id") Long chId) {
    projectService.removeProject(chId);
  }
  // http://localhost:8089/pi/project/modify-project
  @PutMapping("/modify-project")
  public Project modifyProject(@RequestBody Project p) {
    Project project = projectService.modifyProject(p);
    return project;
  }

  // Validate and approve a project
  @PostMapping("/validate-project/{project-id}")
  public ResponseEntity<String> validateProject(@PathVariable("project-id") Long projectId) {
    try {
      // Logic to validate the project (e.g., check if it's complete, has necessary details, etc.)
      // If validation passes, update the project status to "Approved"
      // Otherwise, return an appropriate response (e.g., "Validation failed")
      // You can also throw exceptions if needed

      // Example: Update project status to "Approved"
      Project project = projectService.retriveProject(projectId);
      if (project != null) {
       // project.setStatus_project(Status_project.APPROVED);
        projectService.modifyProject(project);
        return ResponseEntity.ok("Project validated and approved!");
      } else {
        return ResponseEntity.badRequest().body("Project not found");
      }
    } catch (Exception e) {
      return ResponseEntity.status(500).body("Error validating project: " + e.getMessage());
    }
  }


}
