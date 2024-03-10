package tn.esprit.test.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Entity.OfferLoan;
import tn.esprit.test.Services.IOfferLoanService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/offer_loan")
public class OfferLoanRestcontroller {
    IOfferLoanService offerLoanService;
//Afficher
    @GetMapping("/retrieve_all_offers")
    public List<OfferLoan> retrieveAllOfferLoans()
    {
        List<OfferLoan> listOffersL = offerLoanService.retrieveAllOfferLoans();
        return  listOffersL;
    }
// get by id
    @GetMapping("/retrieve_all_offers/{idOffer}")
    public OfferLoan retrieveOfferLoan (@PathVariable("idOffer") Long idOff) {
        OfferLoan offerL = offerLoanService.retrieveOfferLoan(idOff);
        return offerL;
    }

// add
    @PostMapping("/add-offer")
    public OfferLoan addOfferLoan(@RequestBody OfferLoan o) {
        OfferLoan offerL = offerLoanService.addOfferLoan(o);
        return offerL;
    }

// edit
    @PutMapping("/modify-offer")
    public OfferLoan modifyOfferLoan(@RequestBody OfferLoan offer) {
        OfferLoan offerL = offerLoanService.modifyOfferLoan(offer);
        return offerL;
    }

// delete
    @DeleteMapping("/remove-offer/{offer-id}")
    public void removeOfferLoan(@PathVariable("offer-id") Long idOffr) {
        offerLoanService.removeOfferLoan(idOffr);
    }

//Assign + unassign
    @PutMapping("/affecter-request-to-offer/{request-id}/{offer-id}")
    public void assignRequestToOffer(@PathVariable("request-id") Long reqtId,
                                     @PathVariable("offer-id") Long offerId ) {
        offerLoanService.assignRequestToOffer(reqtId,offerId);
    }
    @PutMapping("/unaffecter-request-from-offer/{request-id}/{offer-id}")
    public void unassignRequestFromOffer(@PathVariable("request-id") Long reqtId,
                                         @PathVariable("offer-id") Long offerId
    ) {
        offerLoanService.unassignRequestFromOffer(reqtId,offerId);
    }

}
