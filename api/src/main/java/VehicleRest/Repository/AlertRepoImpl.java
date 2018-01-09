package VehicleRest.Repository;

import VehicleRest.Entity.Alert;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public class AlertRepoImpl implements AlertRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Alert alert) {
        entityManager.persist(alert);
    }

    public List<Alert> getAlerts(String vin) {
        TypedQuery<Alert> query = entityManager.createNamedQuery("Alert.findByVin",
                Alert.class);
        query.setParameter("paramVin", vin);
        List <Alert> alertList=query.getResultList();
        return alertList;


    }

    public List<Alert> getHighAlerts() {
        TypedQuery<Alert> query = entityManager.createNamedQuery("Alert.findHighAlert",
                Alert.class);
        query.setParameter("paramVin", "HIGH");
        query.setParameter("paramTime",new Date(System.currentTimeMillis() - 3600 * 2000));
        List <Alert> alertList=query.getResultList();
        System.out.println(new Date(System.currentTimeMillis() - 3600 * 2000));
        return alertList;
    }

}
