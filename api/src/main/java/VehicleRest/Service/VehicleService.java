package VehicleRest.Service;

import VehicleRest.Entity.Vehicle;

public interface VehicleService {
    Vehicle findOne(String id);
    Vehicle create(Vehicle emp);
    Vehicle update(String id,Vehicle emp);
}
