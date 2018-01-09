package VehicleRest.Repository;

import VehicleRest.Entity.Vehicle;

import java.util.List;

public interface VehicleRepository {
    Vehicle findOne(String id);
    Vehicle create(Vehicle emp);
    Vehicle update(String id,Vehicle emp);
    List<Vehicle> findAll();
}
