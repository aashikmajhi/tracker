package VehicleRest.Repository;

import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Tires;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class VehicleReadingRepositoryImpl implements VehicleReadingRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Readings findOne(String id) {
        Readings em=entityManager.find(Readings.class,id);
        return em;
    }

    public Tires findTireOne(String id) {

        Tires em=entityManager.find(Tires.class,id);
        return em;
    }

    public Readings create(Readings read) {
        entityManager.persist(read.getTires());
        entityManager.persist(read);
        return read;
    }

    public Readings update(String id, Readings read,Tires tire) {
        entityManager.merge(tire);
        entityManager.merge(read);
        return read;
    }
    public void remove(Tires tires){
        entityManager.remove(tires);
    }
}
