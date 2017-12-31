package VehicleRest.Service;

import VehicleRest.Entity.Vehicle;
import VehicleRest.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@EnableTransactionManagement
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository repo;


    @Transactional
    public Vehicle findOne(String id) {
        return repo.findOne(id);

    }

    @Transactional
    public Vehicle create(Vehicle emp) {

        System.out.println(repo);
        Vehicle temp=repo.findOne(emp.getVin());

        if(temp!=null){
            return update(emp.getVin(),emp);
        }

        repo.create(emp);

        return emp;
    }

    @Transactional
    public Vehicle update(String id, Vehicle emp) {

        return repo.update(id,emp);

    }
}
