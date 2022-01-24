package cigma.service;

import cigma.models.Facture;

public interface IFactureService {

    Facture save(Facture c);
    Facture update(Facture c);
    Facture delete(long id);
    Facture find(long id);
    Facture findAll();
}
