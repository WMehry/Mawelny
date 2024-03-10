package tn.esprit.test.Services;

import tn.esprit.test.Entity.Amortization;

import java.util.List;

public interface IAmortizationService {
    public List<Amortization> retrieveAllAmortization();
    public Amortization retrieveAmortization(Long idAmt);
    public Amortization addAmortization (Amortization amrt);
    public Amortization modifyAmortization (Amortization amrt);
    public void removeAmortization (Long idAmt);

}
