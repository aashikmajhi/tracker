package VehicleRest.Service;

import VehicleRest.Entity.Alert;
import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Tires;
import VehicleRest.Entity.Vehicle;
import VehicleRest.Repository.AlertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehicleAlertServiceImpl implements VehicleAlertService {

    @Autowired
    AlertRepo alertRepo;

    @Transactional
    public void create(Readings read, Vehicle vehicle) {
        {   String priority="";
            Tires tires1 = read.getTires();
            if (tires1.getFrontLeft() < 32 || tires1.getFrontLeft() > 36 ||
                    tires1.getFrontRight() < 32 || tires1.getFrontRight() > 36 ||
                    tires1.getRearLeft() < 32 || tires1.getRearLeft() > 36 ||
                    tires1.getRearRight() < 32 || tires1.getRearRight() > 36
                    ) {
                priority = "LOW";
            }
            if (read.getEngineCoolantLow() || read.getCheckEngineLightOn()) {
                priority = "LOW";
            }
            if (read.getFuelVolume() < 0.10 * vehicle.getMaxFuelVolume()) {
                priority = "MEDIUM";
            }
            if (read.getEngineRpm() > vehicle.getRedlineRpm()) {
                priority = "HIGH";
            }

            System.out.println(read.getVin() + " priority " + priority);
            Alert alert = new Alert();
            alert.setCheckEngineLightOn(read.getCheckEngineLightOn());
            alert.setEngineCoolantLow(read.getEngineCoolantLow());
            alert.setTirefrontleft(tires1.getFrontLeft());
            alert.setTirefrontRight(tires1.getFrontRight());
            alert.setTirerearLeft(tires1.getRearLeft());
            alert.setTirerearRight(tires1.getRearRight());
            alert.setFuelVolume(read.getFuelVolume());
            alert.setMaxFuelVolume(Double.parseDouble(vehicle.getMaxFuelVolume().toString()));
            alert.setEngineRPM(read.getEngineRpm());
            alert.setRedLineRPM(vehicle.getRedlineRpm());
            alert.setVin(read.getVin());
            alert.setTimeStamp(read.getTimestamp());
            alert.setPriority(priority);
            alertRepo.create(alert);

        }
    }
}
