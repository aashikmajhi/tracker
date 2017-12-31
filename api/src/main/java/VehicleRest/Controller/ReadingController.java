package VehicleRest.Controller;

import VehicleRest.Entity.Readings;
import VehicleRest.Service.VehicleReading;
import VehicleRest.Service.VehicleReadingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="readings")
public class ReadingController {


    @Autowired
    VehicleReadingService service1;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings update(@RequestBody Readings e) {
       /* for (Readings read : e) {
            service1.create(read);
        }*/
        service1.create(e);
        return null;
    }
}
