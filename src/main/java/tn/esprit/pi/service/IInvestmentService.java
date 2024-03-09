package tn.esprit.pi.service;



import tn.esprit.pi.enitiy.Investment;

import java.util.List;

public interface IInvestmentService {
  public List<Investment> retiveAllInvestments();
  public Investment retriveInvestment (Long idInvestment);
  Investment  addInvestment(Investment i);
  public void removeInvestment(Long idInvestment);
  public Investment modifyInvestment(Investment investment);
  public void assignInvestmentToProject( Long idInvestment, Long idProject);
  public void dessignerInvestmentToProject(Long idInvestment);
 // void confirmInvestment(Long id_Investment);
}
