package VehicleRest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Alert {
    @Id
    String id;
    Date timeStamp;
    String vin;
    Integer Tirefrontleft;
    Integer TirefrontRight;
    Integer TirerearLeft;
    Integer TirerearRight;
    Boolean EngineCoolantLow;
    Boolean checkEngineLightOn;
    Double FuelVolume;
    Double MaxFuelVolume;
    Integer EngineRPM;
    Integer redLineRPM;
    String priority;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Alert(){
        this.id= UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getTirefrontleft() {
        return Tirefrontleft;
    }

    public void setTirefrontleft(Integer tirefrontleft) {
        Tirefrontleft = tirefrontleft;
    }

    public Integer getTirefrontRight() {
        return TirefrontRight;
    }

    public void setTirefrontRight(Integer tirefrontRight) {
        TirefrontRight = tirefrontRight;
    }

    public Integer getTirerearLeft() {
        return TirerearLeft;
    }

    public void setTirerearLeft(Integer tirerearLeft) {
        TirerearLeft = tirerearLeft;
    }

    public Integer getTirerearRight() {
        return TirerearRight;
    }

    public void setTirerearRight(Integer tirerearRight) {
        TirerearRight = tirerearRight;
    }

    public Boolean getEngineCoolantLow() {
        return EngineCoolantLow;
    }

    public void setEngineCoolantLow(Boolean engineCoolantLow) {
        EngineCoolantLow = engineCoolantLow;
    }

    public Boolean getCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(Boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public Double getFuelVolume() {
        return FuelVolume;
    }

    public void setFuelVolume(Double fuelVolume) {
        FuelVolume = fuelVolume;
    }

    public Double getMaxFuelVolume() {
        return MaxFuelVolume;
    }

    public void setMaxFuelVolume(Double maxFuelVolume) {
        MaxFuelVolume = maxFuelVolume;
    }

    public Integer getEngineRPM() {
        return EngineRPM;
    }

    public void setEngineRPM(Integer engineRPM) {
        EngineRPM = engineRPM;
    }

    public Integer getRedLineRPM() {
        return redLineRPM;
    }

    public void setRedLineRPM(Integer redLineRPM) {
        this.redLineRPM = redLineRPM;
    }
}
