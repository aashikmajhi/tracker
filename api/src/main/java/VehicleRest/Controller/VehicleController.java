package VehicleRest.Controller;

import VehicleRest.Entity.Vehicle;
import VehicleRest.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value="vehicles")
public class VehicleController {

    @Autowired
    VehicleService service;


    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle update( @RequestBody Vehicle[] e) {
        for (Vehicle emp1 : e) {
            service.create(emp1);
        }
        return null;
    }

   /* @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle create(@RequestBody Vehicle e){
               return service.create(e);
    }*/


    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll() {
        return service.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{id}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle findOne(@PathVariable("id") String vin) {
        System.out.println(vin);
        return service.findOne(vin);
    }





}
