package cigma.controllers;

import cigma.models.Facture;
import cigma.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("FactureController")
public class FactureController {

    @Autowired
    IFactureService factureService;

    public Facture save(Facture c){
        return factureService.save(c);
    }

    public Facture update(Facture c){
        return factureService.update(c);
    }

    public Facture delete(long id){
        return factureService.delete(id);
    }

    public Facture find(long id){
        return factureService.find(id);
    }

    public Facture findAll(){
        return factureService.findAll();
    }
}
