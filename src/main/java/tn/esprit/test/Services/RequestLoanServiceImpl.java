package tn.esprit.test.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.test.Entity.Amortization;
import tn.esprit.test.Repository.AmortizationRepository;
import tn.esprit.test.Repository.RequestLoanRepository;

import java.util.List;
import tn.esprit.test.Entity.RequestLoan;
@Service
@AllArgsConstructor// inject repo in service
public class RequestLoanServiceImpl implements IRequestLoanService{

    RequestLoanRepository requestLoanRepo;
    AmortizationRepository amortizationRepos;

    public List<RequestLoan> retrieveAllLoans() { return requestLoanRepo.findAll();   }
    public RequestLoan retrieveLoan(Long idRequest) {
        return requestLoanRepo.findById(idRequest).get();
    }
    public RequestLoan addLoan (RequestLoan o)  {
        return requestLoanRepo.save(o);
    }
    public RequestLoan modifyLoan (RequestLoan request) {
        return requestLoanRepo.save(request);
    }
    public void removeLoan(Long idRequest) { requestLoanRepo.deleteById(idRequest);    }

    // Assign + unassign
    public void assignAmortizationToRequest (Long idReqt,Long idAmrt)
    {
        RequestLoan requestLoan= requestLoanRepo.findById(idReqt).get();//parent
        Amortization amortization = amortizationRepos.findById(idAmrt).get();//child

        requestLoan.setAmortization(amortization);
        requestLoanRepo.save(requestLoan);
    }
    public void unassignAmortizationFromRequest (Long idReqt)
    {
        RequestLoan requestLoan= requestLoanRepo.findById(idReqt).get();//parent
        requestLoan.setAmortization(null);
        requestLoanRepo.save(requestLoan);
    }


}
