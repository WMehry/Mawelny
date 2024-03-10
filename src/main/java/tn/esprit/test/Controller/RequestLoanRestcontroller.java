package tn.esprit.test.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Entity.RequestLoan;
import tn.esprit.test.Services.IRequestLoanService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/request_loan")
public class RequestLoanRestcontroller {

    IRequestLoanService requestLoanService;

//Afficher
    @GetMapping("/retrieve_all_requests")
        public List<RequestLoan> retrieveAllLoans()
    {
        List<RequestLoan> listRequestsL = requestLoanService.retrieveAllLoans();
        return  listRequestsL;
    }
// get by id
    @GetMapping("/retrieve_all_requests/{idReq}")
    public RequestLoan retrieveLoan (@PathVariable("idReq") Long idOff) {
        RequestLoan requestL = requestLoanService.retrieveLoan(idOff);
        return requestL;
    }

// add
    @PostMapping("/add-request")
    public RequestLoan addLoan(@RequestBody RequestLoan req) {
        RequestLoan requestL = requestLoanService.addLoan(req);
        return requestL;
    }

// edit
    @PutMapping("/modify-request")
    public RequestLoan modifyLoan(@RequestBody RequestLoan req) {
        RequestLoan requestL = requestLoanService.modifyLoan(req);
        return requestL;
    }

// delete
    @DeleteMapping("/remove-request/{idReq}")
    public void removeRequestLoan(@PathVariable("idReq") Long idReq) {
        requestLoanService.removeLoan(idReq);
    }

// assign + unassign parent to/from child
    @PutMapping("/affecter-request-to-amortization/{request-id}/{amort-id}")
    public void assignAmortizationToRequest(@PathVariable("request-id") Long reqtId,
                                            @PathVariable("amort-id") Long amortId ) {
        requestLoanService.assignAmortizationToRequest(reqtId,amortId);
    }
    @PutMapping("/unaffecter-request-from-amortization/{request-id}")
    public void unassignAmortizationFromRequest(@PathVariable("request-id") Long reqtId ) {
        requestLoanService.unassignAmortizationFromRequest(reqtId);
    }

}
