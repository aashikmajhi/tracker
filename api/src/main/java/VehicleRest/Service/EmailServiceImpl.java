package VehicleRest.Service;

import VehicleRest.Entity.sendEmail;
import VehicleRest.Repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    EmailRepository repo;
    @Transactional
    public void sendEmail(String vin) {
    sendEmail email=new sendEmail();
    email.setVin(vin);
    email.setTimeStamp(new Date());
    repo.sendEmail(email);
    }
}
