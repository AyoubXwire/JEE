package cigma.service;

import cigma.models.Facture;
import cigma.repositories.IFactureRepository;

public class FactureService implements IFactureService {

    IFactureRepository factureRepository;

    public void setFactureRepository(IFactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public FactureService() {
        System.out.println("FactureService..");
    }

    @Override
    public Facture save(Facture c) {
        return factureRepository.save(c);
    }

    @Override
    public Facture update(Facture c) {
        return factureRepository.update(c);
    }

    @Override
    public Facture delete(long id) {
        return factureRepository.delete(id);
    }

    @Override
    public Facture find(long id) {
        return factureRepository.find(id);
    }

    @Override
    public Facture findAll() {
        return factureRepository.findAll();
    }
}
