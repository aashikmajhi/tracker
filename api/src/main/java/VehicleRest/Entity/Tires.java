package VehicleRest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Tires {
    @Id
    String id;
    private Integer frontLeft;
    private Integer frontRight;
    private Integer rearLeft;
    private Integer rearRight;

    public Integer getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(Integer frontLeft) {
        this.frontLeft = frontLeft;
    }

    public Integer getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(Integer frontRight) {
        this.frontRight = frontRight;
    }

    public Integer getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(Integer rearLeft) {
        this.rearLeft = rearLeft;
    }

    public Integer getRearRight() {
        return rearRight;
    }

    public void setRearRight(Integer rearRight) {
        this.rearRight = rearRight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Tires(){
        this.id= UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Tires{" +
                "id='" + id + '\'' +
                ", frontLeft=" + frontLeft +
                ", frontRight=" + frontRight +
                ", rearLeft=" + rearLeft +
                ", rearRight=" + rearRight +
                '}';
    }
}
