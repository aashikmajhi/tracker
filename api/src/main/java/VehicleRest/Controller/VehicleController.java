package VehicleRest.Controller;

import VehicleRest.Entity.Vehicle;
import VehicleRest.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="vehicles")
public class VehicleController {

    @Autowired
    VehicleService service;

    @CrossOrigin
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
    //Implementing get
    @RequestMapping(method = RequestMethod.GET)
    public Vehicle run(){

        return null;
    }



}
