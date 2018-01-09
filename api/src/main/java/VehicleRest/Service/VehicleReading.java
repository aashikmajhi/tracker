package VehicleRest.Service;

import VehicleRest.Entity.Alert;
import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Tires;
import VehicleRest.Entity.Vehicle;
import VehicleRest.Repository.AlertRepo;
import VehicleRest.Repository.VehicleReadingRepository;
import VehicleRest.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@EnableTransactionManagement
public class VehicleReading implements VehicleReadingService {

    @Autowired
    VehicleReadingRepository repo;

    @Autowired
    VehicleRepository vehicleRepo;

    @Autowired
    VehicleAlertService vehicleAlertService;

    @Transactional
    public Readings findOne(String id) {
        return repo.findOne(id);
    }

    public Tires findTireOne(String id) {
        return(repo.findTireOne(id));

    }

    @Transactional
    public List<Readings> getReadings(String vin) {
        return repo.getReadings(vin);
    }

    @Transactional
    public Readings create(Readings read) {
        //creating the alert

        Vehicle vehicle;
        vehicle = vehicleRepo.findOne(read.getVin());
        if(vehicle!=null) {
            vehicleAlertService.create(read,vehicle);
        }

        Readings temp=repo.findOne(read.getId());
        if(temp!=null){
            Tires tires=findTireOne(temp.getTires().getId());
            //repo.remove(tires);
            return update(read.getVin(),read,read.getTires());

        }
        repo.create(read);
        return read;
    }
    @Transactional
    public Readings update(String id, Readings read,Tires tires) {

        return repo.update(id,read,tires);
    }


}
