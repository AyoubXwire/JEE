package cigma.repositories;

import cigma.models.Facture;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class FactureRepository implements IFactureRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Facture save(Facture f) {
        em.persist(f);
        return null;
    }

    @Override
    public Facture update(Facture f) {
        em.merge(f);
        return null;
    }

    @Override
    public Facture delete(long id) {
        String hql = "delete " + Facture.class.getName() + " where id = :id";
        Query query = em.createQuery(hql).setParameter("id", id);
        return null;
    }

    @Override
    public Facture find(long id) {
        return em.find(Facture.class, id);
    }

    @Override
    public Facture findAll() {
        Query query = em.createQuery("SELECT * FROM factures");
        return (Facture) query.getResultList();
    }
}
