package tn.esprit.test.Services;
import tn.esprit.test.Entity.RequestLoan;
import java.util.List;

public interface IRequestLoanService {
    public List<RequestLoan> retrieveAllLoans();
    public RequestLoan retrieveLoan(Long idRequest);
    public RequestLoan addLoan (RequestLoan o);
    public RequestLoan modifyLoan (RequestLoan request);
    public void removeLoan(Long idRequest);

    //Assign + unassign child to/from parent
    public void assignAmortizationToRequest (Long idReqt,Long idAmrt);
    public void unassignAmortizationFromRequest (Long idReqt);

}
