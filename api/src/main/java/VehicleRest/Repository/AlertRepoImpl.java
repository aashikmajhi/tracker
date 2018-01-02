package VehicleRest.Repository;

import VehicleRest.Entity.Alert;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class AlertRepoImpl implements AlertRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Alert alert) {
        entityManager.persist(alert);
    }
}
