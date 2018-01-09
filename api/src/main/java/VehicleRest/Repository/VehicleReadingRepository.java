package VehicleRest.Repository;

import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Tires;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface VehicleReadingRepository {

    Readings findOne(String id);
    Readings create(Readings read);
    Readings update(String id,Readings read,Tires tire);
    Tires findTireOne(String id);
    void remove(Tires tires);
    List<Readings> getReadings(String vin);


}
