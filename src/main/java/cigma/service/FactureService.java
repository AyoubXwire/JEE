package cigma.service;

import cigma.models.Facture;
import cigma.repositories.IFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FactureService implements IFactureService {

    @Autowired
    IFactureRepository factureRepository;

    @Override
    @Transactional
    public Facture save(Facture c) {
        return factureRepository.save(c);
    }

    @Override
    @Transactional
    public Facture update(Facture c) {
        return factureRepository.update(c);
    }

    @Override
    @Transactional
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
