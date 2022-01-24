package cigma.repositories;

import cigma.models.Facture;

public interface IFactureRepository {

    Facture save(Facture c);
    Facture update(Facture c);
    Facture delete(long id);
    Facture find(long id);
    Facture findAll();
}