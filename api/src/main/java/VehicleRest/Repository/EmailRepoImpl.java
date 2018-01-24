package VehicleRest.Repository;


import VehicleRest.Entity.sendEmail;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EmailRepoImpl implements EmailRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public void sendEmail(sendEmail send){
        entityManager.persist(send);
    }
}
