package tn.esprit.pi.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pi.enitiy.Investment;
import tn.esprit.pi.enitiy.Project;
import tn.esprit.pi.repository.InvestmentRepository;
import tn.esprit.pi.repository.ProjectRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InvestmentServiceImpl implements  IInvestmentService{
InvestmentRepository investmentRepository;
ProjectRepository projectRepository;
  public List<Investment> retiveAllInvestments() {
    return investmentRepository.findAll();
  }


  public Investment retriveInvestment(Long idInvestment) {
    return investmentRepository.findById(idInvestment).get();
  }


  public Investment addInvestment(Investment i) {
    return investmentRepository.save(i);
  }


  public void removeInvestment(Long idInvestment) {
    investmentRepository.deleteById(idInvestment);
  }


  public Investment modifyInvestment(Investment investment) {
    return investmentRepository.save(investment);
  }

  public void assignInvestmentToProject( Long idInvestment, Long idProject) {
    Project project = projectRepository.findById(idProject).get();
    Investment investment = investmentRepository.findById(idInvestment).get();
// on set le fils dans le parent :
    investment.setProject(project);
    projectRepository.save(project);
  }
  public void dessignerInvestmentToProject(Long idInvestment) {
    Investment investment = investmentRepository.findById(idInvestment).get();

// on set le fils dans le parent :
    investment.setProject(null);
    investmentRepository.save(investment);
  }

 /* public Investment validateInvestment(Long investmentId) {
    Investment investment = investmentRepository.findById(investmentId)
      .orElseThrow(() -> new EntityNotFoundException("Investment not found"));

    return investmentRepository.save(investment);
  }*/



}
