package week14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
    String type;
    Date enterTime;

    public Car(String type, Date enterTime) {
        this.type = type;
        this.enterTime = enterTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getEnter() {
        return enterTime;
    }

    public void setEnter(Date enterTime) {
        this.enterTime = enterTime;
    }
}
