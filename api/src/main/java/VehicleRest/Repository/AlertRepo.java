package VehicleRest.Repository;

import VehicleRest.Entity.Alert;

import java.util.List;

public interface AlertRepo {
    public void create(Alert alert);
    public List<Alert> getAlerts(String vin);
    public List<Alert> getHighAlerts();
}
