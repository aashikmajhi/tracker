package VehicleRest.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;

public class Readings {
    @Id
    private String vin;
    private String latitude;
    private String longitude;
    private Date timestamp;
    private String fuelVolume;
    private String speed;
    private String engineHp;
    private String checkEngineLightOn;
    private String engineCoolantLow;
    private String cruiseControlOn;
    private String engineRpm;

    @OneToOne
    private Tires tires;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLat() {
        return latitude;
    }

    public void setLat(String lat) {
        this.latitude = lat;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String lon) {
        this.longitude = lon;
    }

    public Date getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timestamp = timeStamp;
    }

    public String getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(String fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(String engineHp) {
        this.engineHp = engineHp;
    }

    public String getCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(String checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public String getEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(String engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public String getCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(String cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public String getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(String engineRpm) {
        this.engineRpm = engineRpm;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
