package tn.esprit.test.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Entity.Amortization;
import tn.esprit.test.Services.IAmortizationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/amortization")
public class AmortizationRestcontroller {
    IAmortizationService amortizationService;

//Afficher
    @GetMapping("/retrieve_all_offers")
    public List<Amortization> retrieveAllAmortization()
    {
        List<Amortization> listAmrt = amortizationService.retrieveAllAmortization();
        return  listAmrt;
    }
// get by id
    @GetMapping("/retrieve_all_offers/{idAmrt}")
    public Amortization retrieveAmortization (@PathVariable("idAmrt") Long idAmrt) {
        Amortization Amrt = amortizationService.retrieveAmortization(idAmrt);
        return Amrt;
    }

// add
    @PostMapping("/add-amort")
    public Amortization addAmortization(@RequestBody Amortization amrt) {
        Amortization Amrt = amortizationService.addAmortization(amrt);
        return Amrt;
    }

// edit
    @PutMapping("/modify-offer")
    public Amortization modifyAmortization(@RequestBody Amortization amrt) {
        Amortization Amrt = amortizationService.modifyAmortization(amrt);
        return Amrt;
    }

// delete
    @DeleteMapping("/remove-amrt/{idAmrt}")
    public void removeAmortization(@PathVariable("idAmrt") Long idAmrt) {
        amortizationService.removeAmortization(idAmrt);
    }




}
