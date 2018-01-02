package VehicleRest.Service;

import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Vehicle;

public interface VehicleAlertService {

    public void create(Readings read, Vehicle vehicle);
}
