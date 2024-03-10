package tn.esprit.test.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.test.Entity.Amortization;
import tn.esprit.test.Repository.AmortizationRepository;

import java.util.List;

@Service
@AllArgsConstructor// inject repo in service
public class AmortizationServiceImpl implements  IAmortizationService{
    AmortizationRepository amortizationRepo;

    public List<Amortization> retrieveAllAmortization() { return amortizationRepo.findAll();   }
    public Amortization retrieveAmortization(Long idAmrt) {
        return amortizationRepo.findById(idAmrt).get();
    }
    public Amortization addAmortization (Amortization amrt)  {
        return amortizationRepo.save(amrt);
    }
    public Amortization modifyAmortization (Amortization amrt) {
        return amortizationRepo.save(amrt);
    }
    public void removeAmortization(Long idAmrt) { amortizationRepo.deleteById(idAmrt);    }

}
