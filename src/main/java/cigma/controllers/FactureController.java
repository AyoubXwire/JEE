package cigma.controllers;

import cigma.models.Facture;
import cigma.service.IFactureService;

public class FactureController {

    IFactureService factureService;

    public void setFactureService(IFactureService factureService) {
        this.factureService = factureService;
    }

    public FactureController() {
        System.out.println("ClientController..");
    }

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
