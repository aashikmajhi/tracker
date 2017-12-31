package VehicleRest.Service;

import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Tires;
import VehicleRest.Entity.Vehicle;

public interface VehicleReadingService {
    Readings findOne(String id);
    Readings create(Readings emp);
    Readings update(String id,Readings emp,Tires tire);
    Tires findTireOne(String id);
}

