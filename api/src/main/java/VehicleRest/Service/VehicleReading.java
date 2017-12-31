package VehicleRest.Service;

import VehicleRest.Entity.Readings;
import VehicleRest.Entity.Tires;
import VehicleRest.Entity.Vehicle;
import VehicleRest.Repository.VehicleReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@EnableTransactionManagement
public class VehicleReading implements VehicleReadingService {

    @Autowired
    VehicleReadingRepository repo;

    @Transactional
    public Readings findOne(String id) {
        return repo.findOne(id);
    }

    public Tires findTireOne(String id) {
        return(repo.findTireOne(id));

    }

    @Transactional
    public Readings create(Readings read) {
        Readings temp=repo.findOne(read.getVin());
        if(temp!=null){
            Tires tires=findTireOne(temp.getTires().getId());
            repo.remove(tires);
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
