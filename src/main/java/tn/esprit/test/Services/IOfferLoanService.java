package tn.esprit.test.Services;

import tn.esprit.test.Entity.OfferLoan;

import java.util.List;

public interface IOfferLoanService {
    public List<OfferLoan> retrieveAllOfferLoans();
    public OfferLoan retrieveOfferLoan(Long idOffer);
    public OfferLoan addOfferLoan (OfferLoan o);
    public OfferLoan modifyOfferLoan (OfferLoan offer);
    public void removeOfferLoan(Long idOffer);

    //Assign + unassign:
    public void assignRequestToOffer (Long idOffer, Long idReqt);
    public void unassignRequestFromOffer (Long idOffr, Long idReqt);

}
