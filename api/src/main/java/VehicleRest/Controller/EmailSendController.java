package VehicleRest.Controller;


import VehicleRest.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="sendEmail")
public class EmailSendController {
    @Autowired
    EmailService emailService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void sendEmail(@PathVariable("id") String vin) {
         emailService.sendEmail(vin);
    }
}
