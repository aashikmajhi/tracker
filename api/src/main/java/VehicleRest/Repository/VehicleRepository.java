package VehicleRest.Repository;

import VehicleRest.Entity.Vehicle;

public interface VehicleRepository {
    Vehicle findOne(String id);
    Vehicle create(Vehicle emp);
    Vehicle update(String id,Vehicle emp);
}
