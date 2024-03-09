package tn.esprit.pi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pi.enitiy.Investment;
import tn.esprit.pi.service.IInvestmentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/investment")
public class InvestmentRestController {
  IInvestmentService investmentService;
  // http://localhost:8089/pi/investment/retrieve-all-investments
  @GetMapping("/retrieve-all-investments")
  public List<Investment> getInvestments() {
    List<Investment> listInvestments = investmentService.retiveAllInvestments();
    return listInvestments;
  }
  // http://localhost:8089/pi/investment/retrieve-investment/8
  @GetMapping("/retrieve-investment/{investment-id}")
  public Investment retrieveInvestment(@PathVariable("investment-id") Long investmentId) {
    Investment investment = investmentService.retriveInvestment(investmentId);
    return investment;}
  // http://localhost:8089/pi/investment/add-investment
  @PostMapping("/add-investment")
  public Investment addInvestment(@RequestBody Investment i) {
    Investment investment = investmentService.addInvestment(i);
    return investment;
  }
  // http://localhost:8089/pi/investment/remove-investment/{investment-id}
  @DeleteMapping("/remove-investment/{investment-id}")
  public void removeInvestment(@PathVariable("investment-id") Long invId) {
    investmentService.removeInvestment(invId);
  }
  // http://localhost:8089/pi/investment/modify-investment
  @PutMapping("/modify-investment")
  public Investment modifyInvestment(@RequestBody Investment i) {
    Investment investment = investmentService.modifyInvestment(i);
    return investment;
  }

  // Validate and approve a investment
 /* @PostMapping("/validate-investment/{investment-id}")
  public ResponseEntity<String> validateInvestment(@PathVariable("investment-id") Long investmentId) {
    try {
      // Logic to validate the investment (e.g., check if it's complete, has necessary details, etc.)
      // If validation passes, update the investment status to "Approved"
      // Otherwise, return an appropriate response (e.g., "Validation failed")
      // You can also throw exceptions if needed

      // Example: Update investment status to "Approved"
      Investment investment = investmentService.retriveInvestment(investmentId);
      if (investment != null) {
       // investment.setStatus_investment(Status_investment.APPROVED);
        investmentService.modifyInvestment(investment);
        return ResponseEntity.ok("Investment validated and approved!");
      } else {
        return ResponseEntity.badRequest().body("Investment not found");
      }
    } catch (Exception e) {
      return ResponseEntity.status(500).body("Error validating investment: " + e.getMessage());
    }
  }*/

  @PutMapping("/affecter-investment-a-idProject/{investment-id}/{idProject}")
  public void affecgterInvestmentAidProject(@PathVariable("investment-id") Long idInvestment,
                                    @PathVariable("idProject") Long idProject) {
    investmentService.assignInvestmentToProject(idInvestment, idProject);
  }

  @PutMapping("/desaffecter-investment-a-dProject/{investment-id}")
  public void desaffecgterInvestmentAidProject(@PathVariable("investment-id") Long idInvestment){
    investmentService.dessignerInvestmentToProject(idInvestment);
  }
}
