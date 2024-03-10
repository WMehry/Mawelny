package tn.esprit.test.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.test.Entity.OfferLoan;
import tn.esprit.test.Entity.RequestLoan;
import tn.esprit.test.Repository.OfferLoanRepository;
import tn.esprit.test.Repository.RequestLoanRepository;

import java.util.List;

@Service
@AllArgsConstructor// inject repo in service
public class OfferLoanServiceImpl implements  IOfferLoanService{

    OfferLoanRepository offerLoanRepo;
    RequestLoanRepository requestLoanRepo;

    public List<OfferLoan> retrieveAllOfferLoans() { return offerLoanRepo.findAll();   }
    public OfferLoan retrieveOfferLoan(Long idOffer) {
        return offerLoanRepo.findById(idOffer).get();
    }
    public OfferLoan addOfferLoan (OfferLoan o)  {
        return offerLoanRepo.save(o);
    }
    public OfferLoan modifyOfferLoan (OfferLoan offer) {
        return offerLoanRepo.save(offer);
    }
    public void removeOfferLoan(Long idOffer) { offerLoanRepo.deleteById(idOffer);    }

    // Assign + unassign child to/from parent
    public void assignRequestToOffer (Long idOffer, Long idReqt)
    {
        OfferLoan offerLoan= offerLoanRepo.findById(idOffer).get();//parent
        RequestLoan requestLoan = requestLoanRepo.findById(idReqt).get();//child

        offerLoan.getRequestloans().add(requestLoan);
        offerLoanRepo.save(offerLoan);
    }
    public void unassignRequestFromOffer (Long idOffr, Long idReqt)
    {
        OfferLoan offerLoan= offerLoanRepo.findById(idOffr).get();//parent
        RequestLoan requestLoan = requestLoanRepo.findById(idReqt).get();//child

        offerLoan.getRequestloans().remove(requestLoan);
        offerLoanRepo.save(offerLoan);
    }


}
