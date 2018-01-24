package VehicleRest.Controller;

import VehicleRest.Entity.Alert;
import VehicleRest.Service.VehicleAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value="alert")
public class AlertController {
    @Autowired
    VehicleAlertService vehicleAlertService;
    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Alert> findHighAlerts() {
        return vehicleAlertService.getHighAlerts();
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{id}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Alert> findOne(@PathVariable("id") String vin) {
        System.out.println("Queried for Alert"+vin);
        return vehicleAlertService.getAlerts(vin);
    }

}