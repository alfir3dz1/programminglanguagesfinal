package database.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//Inherits from Abstract Class
@Stateless
public class GamesFacade extends AbstractFacade<Games> {

    @PersistenceContext(unitName = "DatabasePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GamesFacade() {
        super(Games.class);
    }
    
}
