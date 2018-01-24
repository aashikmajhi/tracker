package VehicleRest.Service;

import VehicleRest.Entity.Alert;
import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Vehicle;

import java.util.List;

public interface VehicleAlertService {

    public void create(Readings read, Vehicle vehicle);
    public List<Alert> getAlerts(String vin);
    public List<Alert> getHighAlerts();
}
